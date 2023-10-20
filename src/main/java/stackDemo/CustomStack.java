package stackDemo;

public class CustomStack {
    long[] stackArray;
    int maxSize;
    int topPosition;

    public CustomStack(int size) {
        maxSize = size;
        stackArray = new long[size];
        topPosition = -1;
    }

    public void push(long j) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        topPosition++;
        stackArray[topPosition] = j;
    }

    public long pop() throws IllegalAccessException {
        if (isEmpty()) {
            throw new IllegalAccessException("Stack is empty");
        }
        return stackArray[topPosition--];
    }

    public boolean isEmpty() {
        return topPosition == -1;
    }

    public boolean isFull() {
        return topPosition == maxSize - 1;
    }

    public long peek() throws IllegalAccessException {
        if (isEmpty()) {
                throw new IllegalAccessException("Stack is empty");
        }
        return stackArray[topPosition];
    }
}
