import java.sql.*;

public class BankingSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/banking_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.processTransactions();
    }

    public void processTransactions() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connection.setAutoCommit(false); // Start transaction

            // 1. Perform fund transfer
            boolean transferSuccess = transferFunds(connection, 1, 2, 200.00);

            // 2. Batch insert new accounts
            boolean batchInsertSuccess = batchInsertAccounts(connection);

            if (transferSuccess && batchInsertSuccess) {
                connection.commit(); // Commit only if all transactions succeed
                System.out.println("Transaction Successful!");
            } else {
                connection.rollback(); // Rollback if any failure
                System.out.println("Transaction Failed! Rolling back changes.");
            }
        } catch (SQLException e) {
            try {
                if (connection != null) connection.rollback(); // Ensure rollback on error
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean transferFunds(Connection connection, int fromAccount, int toAccount, double amount) {
        String withdrawSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String depositSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (PreparedStatement withdrawStmt = connection.prepareStatement(withdrawSQL);
             PreparedStatement depositStmt = connection.prepareStatement(depositSQL)) {

            // Withdraw from sender
            withdrawStmt.setDouble(1, amount);
            withdrawStmt.setInt(2, fromAccount);
            int withdrawAffected = withdrawStmt.executeUpdate();

            // Deposit to receiver
            depositStmt.setDouble(1, amount);
            depositStmt.setInt(2, toAccount);
            int depositAffected = depositStmt.executeUpdate();

            return withdrawAffected > 0 && depositAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean batchInsertAccounts(Connection connection) {
        String insertSQL = "INSERT INTO accounts (name, balance) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setString(1, "John Doe");
            pstmt.setDouble(2, 1000.00);
            pstmt.addBatch();

            pstmt.setString(1, "Jane Smith");
            pstmt.setDouble(2, 2000.00);
            pstmt.addBatch();

            pstmt.setString(1, "Alice Brown");
            pstmt.setDouble(2, 1500.00);
            pstmt.addBatch();

            int[] results = pstmt.executeBatch();
            return results.length > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}