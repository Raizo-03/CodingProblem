public class main {

    public static void main(String[] args) {
        // Creating a Thread using the Runnable interface
        Runnable task = new Runnable() {
            @Override
            public void run() {
                // This is what the thread will execute
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
                        System.out.println("Thread: " + i);
                    } catch (InterruptedException e) {
                        System.err.println("Thread was interrupted.");
                    }
                }
            }
        };

        // Creating a Thread object
        Thread thread = new Thread(task);

        // Starting the thread
        thread.start();

        // Main thread continues to execute
        System.out.println("Main thread continues to run...");

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted.");
        }

        System.out.println("Thread has finished counting.");
    }
}