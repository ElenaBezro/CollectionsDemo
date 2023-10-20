package stackDemo;

import java.util.Arrays;

public class CustomStack<T extends Comparable> {
    private T[] stackArray;
    private int maxSize;
    private final int INITIAL_MAX_SIZE;
    private int topPosition;

    public CustomStack(int size) {
        maxSize = size;
        INITIAL_MAX_SIZE = size;
        stackArray = (T[]) new Comparable[size];
        topPosition = -1;
    }

    public void push(T j) {
        if (isFull()) {
            T[] newStackArray = (T[]) new Comparable[maxSize * 2];
            System.arraycopy(stackArray,0, newStackArray,0, maxSize);
            maxSize = maxSize * 2;
            stackArray = newStackArray;
        }
        topPosition++;
        stackArray[topPosition] = j;
    }

    public T pop() throws IllegalAccessException {
        if (isEmpty()) {
            throw new IllegalAccessException("Stack is empty");
        }

        boolean isTreeFourthsEmpty = topPosition < (maxSize - 1) * 0.25 && maxSize / 2 > INITIAL_MAX_SIZE;

        if (isTreeFourthsEmpty) {
            int newSize = maxSize / 2;
            T[] newStackArray = (T[]) new Object[newSize];
            System.arraycopy(stackArray, 0, newStackArray,0,newSize);
            stackArray = newStackArray;
        }
        return stackArray[topPosition--];
    }

    public boolean isEmpty() {
        return topPosition == -1;
    }

    public boolean isFull() {
        return topPosition == maxSize - 1;
    }

    public T peek() throws IllegalAccessException {
        if (isEmpty()) {
            throw new IllegalAccessException("Stack is empty");
        }
        return stackArray[topPosition];
    }

    public int size() {
        return topPosition + 1;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T element: stackArray) {
            result.append(element).append("\n");
        }
        return  result.toString();
    }

    public void sort() {
        Arrays.sort(stackArray);
    }
}
