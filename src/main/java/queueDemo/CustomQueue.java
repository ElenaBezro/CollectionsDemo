package queueDemo;

import java.util.ArrayList;
import java.util.List;

public class CustomQueue<T> {
    private int length;
    private List<T> items;
    private int front = -1;
    private int back = -1;


    //Bonus
    public CustomQueue(int length) {
        items = new ArrayList<T>(length);
        this.length = length;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return back == length - 1;
    }

    public void enQueue(T itemValue) {
        try {
            if (isFull()) {
                throw new IllegalAccessException("Queue is full");
            } else if (!isEmpty()) {
                back++;
                items.set(back, itemValue);
            } else {
                front = 0;
                back = 0;
                items.set(back, itemValue);
            }
        }
        catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (back == 0) {
            front = -1;
            back = -1;
        } else {
            front++;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= back; i++) {
                System.out.println(i + " item: " + items.get(i));
            }
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Front item: " + items.get(front));
        } else {
            System.out.println("Queue is empty");
        }
    }

}
