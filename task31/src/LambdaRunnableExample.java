public class LambdaRunnableExample {
    public static void main(String[] args) {
        // Creating a thread using Runnable with Lambda Expression
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + i);
                try {
                    Thread.sleep(500); // Pause for 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Start the thread
        Thread thread = new Thread(task);
        thread.start();
    }
}