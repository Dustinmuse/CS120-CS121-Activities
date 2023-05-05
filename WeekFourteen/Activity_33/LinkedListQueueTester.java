package WeekFourteen.Activity_33;

public class LinkedListQueueTester
{
    public static void main(String[] args)
    {
        LinkedListQueue one = new LinkedListQueue();

        one.enqueue("Tom");
        one.enqueue("Jane");
        one.enqueue("Beth");

        System.out.println(one.displayQueue());
        System.out.println();

        one.dequeue();
        one.dequeue();
        one.dequeue();

        one.enqueue("Tom");
        one.enqueue("Jane");
        one.enqueue("Beth");
        one.enqueue("John");
        one.enqueue("Mary");

        System.out.println(one.displayQueue());
        System.out.println();

        System.out.println("Queue is empty: " + one.isEmpty());
        System.out.println("Number of items in queue: " + one.size());
        System.out.println("The head of the queue is: " + one.peek());
        System.out.println();
        one.dequeue();

        System.out.println(one.displayQueue());
        System.out.println();

        System.out.println("Queue is empty: " + one.isEmpty());
        System.out.println("Number of items in queue: " + one.size());
        System.out.println("The head of the queue is: " + one.peek());

        one.dequeue();

        System.out.println();

        System.out.println("Queue is empty: " + one.isEmpty());
        System.out.println("Number of items in queue: " + one.size());
        System.out.println("The head of the queue is: " + one.peek());

        one.dequeue();

        System.out.println();

        System.out.println("Queue is empty: " + one.isEmpty());
        System.out.println("Number of items in queue: " + one.size());
        System.out.println("The head of the queue is: " + one.peek());

        one.dequeue();

        System.out.println();

        System.out.println("Queue is empty: " + one.isEmpty());
        System.out.println("Number of items in queue: " + one.size());
        System.out.println("The head of the queue is: " + one.peek());

        one.dequeue();

        System.out.println();

        System.out.println("Queue is empty: " + one.isEmpty());
        System.out.println("Number of items in queue: " + one.size());
        System.out.println("The head of the queue is: " + one.peek());
    }
}
