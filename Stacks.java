package package2;

public class Stacks {
    static int[] numArray;
    static int top;
    static int size;

    public Stacks(int capacity) {
        numArray = new int[capacity];
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    protected static void push(int value) {
        if (!isFull()) {
            numArray[++top] = value;
            size++;
        } else {
            System.out.println("Full");
        }
    }

    public static int pop() {
        if (!isEmpty()) {
            int data = numArray[top--];
            size--;
            return data;
        }
        return -1;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == numArray.length;
    }

    public static int peek() {
        if (top >= 0) {
            return numArray[top];
        }
        return -1;
    }

    public static void main(String[] args) {
        Stacks num = new Stacks(4);
        num.push(331);
        num.push(52);
        num.push(73);
        num.push(44);

        num.pop();
        num.pop();
        for (int i = 0; i < size; i++) {
            System.out.println(numArray[i]);
        }
    }
}

