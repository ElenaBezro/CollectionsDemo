package stackDemo.stackPractice;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<T> {
    private List<T> itemStack = new ArrayList<>();
    private int top;

    public List<T> getStackList() {
        return itemStack;
    }

    public void printStack() {
        for (int i = itemStack.size()-1; i >= 0; i--) {
            System.out.println(itemStack.get(i));
        }
    }

    public boolean isEmpty() {
        return itemStack.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return itemStack.get(itemStack.size() - 1);
        }
    }

    public int size() {
        return itemStack.size();
    }

    public void push(T item) {
        itemStack.add(item);
    }

    public T pop() {
        if (isEmpty()){
            return null;
        }
        return itemStack.remove(size() - 1);
    }
}
