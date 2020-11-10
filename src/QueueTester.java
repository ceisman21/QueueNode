import java.util.Scanner;

public class QueueTester {
    public static void main(String[] args) {
        Queue theQueue = new Queue();
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, and welcome to the Queue tester!");
        System.out.println("First, I'll need three inputs from you...");
        System.out.print("Please give me an Input 1: ");
        theQueue.enqueue(s.next());
        System.out.print("\nPlease give me an Input 2: ");
        theQueue.enqueue(s.next());
        System.out.print("\nPlease give me an Input 3: ");
        theQueue.enqueue(s.next());
        System.out.println("\n\n");
        System.out.println("Now, we will text to make sure that these Queue Items are working properly.\n\n");
        System.out.println("Should Be input 1:" +  theQueue.dequeue());
        System.out.println("Should Be input 2:" +  theQueue.dequeue());
        System.out.println("Should Be input 3:" +  theQueue.dequeue());

        theQueue.enqueue("");
    }
}
