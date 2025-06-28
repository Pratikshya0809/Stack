/*//QN1.
public class Stack {
    private int[] data;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        data = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        data[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
*/
/*//QN2.
public class CustomStack {
    private int[] stackArray;
    private int pointer;
    private final int limit;

    public CustomStack(int capacity) {
        limit = capacity;
        stackArray = new int[limit];
        pointer = 0;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Cannot push: Stack is full");
            return;
        }
        stackArray[pointer++] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Nothing to pop: Stack is empty");
            return -1;
        }
        return stackArray[--pointer];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[pointer - 1];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public boolean isFull() {
        return pointer == limit;
    }
}
*/
/*//QN3.
import java.util.Scanner;

public class SupermarketQueue {
    private static final int MAX = 10;
    private static String[] queue = new String[MAX];
    private static int front = 0, rear = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Customer Count");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    if ((rear + 1) % MAX == front) {
                        System.out.println("Queue is full!");
                    } else {
                        System.out.print("Enter customer name: ");
                        queue[rear] = sc.nextLine();
                        rear = (rear + 1) % MAX;
                    }
                    break;
                case 2:
                    if (front == rear) {
                        System.out.println("No customers in queue.");
                    } else {
                        System.out.println("Serving: " + queue[front]);
                        front = (front + 1) % MAX;
                    }
                    break;
                case 3:
                    if (front == rear) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.print("Queue: ");
                        int i = front;
                        while (i != rear) {
                            System.out.print(queue[i] + " ");
                            i = (i + 1) % MAX;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int count = (rear - front + MAX) % MAX;
                    System.out.println("Number of customers: " + count);
                    break;
                case 5:
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);

        sc.close();
    }
}
*/
/*//QN4.
import java.util.Scanner;

public class CallCenterQueue {
    private static final int MAX = 15;
    private static String[] calls = new String[MAX];
    private static int start = 0, end = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt;

        do {
            System.out.println("\n--- Call Center System ---");
            System.out.println("1. Add Incoming Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. View Call Queue");
            System.out.println("4. Show Pending Calls");
            System.out.println("5. Exit");
            System.out.print("Select: ");
            opt = input.nextInt(); input.nextLine();

            switch (opt) {
                case 1:
                    if ((end + 1) % MAX == start) {
                        System.out.println("Call queue is full!");
                    } else {
                        System.out.print("Enter caller ID: ");
                        calls[end] = input.nextLine();
                        end = (end + 1) % MAX;
                    }
                    break;
                case 2:
                    if (start == end) {
                        System.out.println("No calls to handle.");
                    } else {
                        System.out.println("Handling Call: " + calls[start]);
                        start = (start + 1) % MAX;
                    }
                    break;
                case 3:
                    System.out.print("Current Call Queue: ");
                    if (start == end) {
                        System.out.println("Empty.");
                    } else {
                        int i = start;
                        while (i != end) {
                            System.out.print(calls[i] + " ");
                            i = (i + 1) % MAX;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int pending = (end - start + MAX) % MAX;
                    System.out.println("Pending Calls: " + pending);
                    break;
                case 5:
                    System.out.println("Shutting down call center.");
                    break;
                default:
                    System.out.println("Invalid option!");
            }

        } while (opt != 5);

        input.close();
    }
}
 */
