import java.util.Scanner;

public class QueueTester {
    public static void main(String[] args) {
        Queue theQueue = new Queue();
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, and welcome to the Queue tester!");
        System.out.println("Testing length: " + theQueue.size());
        System.out.println("Testing isEmpty: " + theQueue.isEmpty());
        System.out.println("How many inputs would you like to put in the stack (give me a number)...");
        int len = s.nextInt();
        for (int x = 1; x <= len; x++) {
            System.out.print("Please give me an Input " + x + ": ");
            theQueue.enqueue(s.next());
            System.out.print("\n");
        }
        System.out.println("\n\n");
        System.out.println("Testing length: " + theQueue.size());
        System.out.println("Testing isEmpty: " + theQueue.isEmpty());
        System.out.println("Now, we will text to make sure that these Queue Items are working properly.\n\n");
        for (int x = 1; x <= len; x++) {
            System.out.print("This should be your input  " + x + ": ");
            System.out.println(theQueue.dequeue());
        }
        System.out.println("Testing length after dequeue: " + theQueue.size());
        System.out.println("Testing isEmpty after dequeue: " + theQueue.isEmpty());
    }
}
