import java.sql.*;
public class DatabaseConnectionExample {

	public static void main(String[] args) {
		String url = "jdbc:mysql://loccalhost:8080/testdb";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement stmt = con.createStatement();
			String sql = "Select * froom employees";
			ResultSet res = stmt.executeQuery(sql);
			
			System.out.println("ID | NAme | Department | Salary ");
			
			while(res.next()) {
				int id = res.getInt("id");
				String name = res.getString("name");
				String department = res.getString("department");
				double salary = res.getDouble("salary");
				
				
				System.out.printf("%d | %-7s | %-10 | %.2f%n ", id , name , department , salary);
			}
			res.close();
			stmt.close();
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
