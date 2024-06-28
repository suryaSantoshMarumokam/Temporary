public class HelloWorld {
    public static void main(String[] args) {
        try {
            Thread.sleep(30000); // Sleep for 30 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int x = 30;
        // Print the input
        System.out.println("Hello World");
    }
}
