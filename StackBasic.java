public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow! Cannot push element " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed element " + value + " to the stack.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow! Cannot pop element from an empty stack.");
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String args[]) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}
