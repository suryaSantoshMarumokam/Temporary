public class HelloWorld {
    public static void main(String[] args) {
        try {
            Thread.sleep(30000); // Sleep for 30 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print the input
        System.out.println("Input: " + args[0]);
    }
}
