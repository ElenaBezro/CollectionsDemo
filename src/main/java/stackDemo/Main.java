package stackDemo;

public class Main {
    public static void main(String[] args) {
        CustomStack<Person> personStack = new CustomStack<>(3);
        personStack.push(new Person("Lena", 35));
        personStack.push(new Person("Lena", 25));
        personStack.push(new Person("Lena", 30));
        System.out.println(personStack);

        try {
            Person person = personStack.pop();
            System.out.println("Pop operation result: " + person);
        }
        catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("******");

        System.out.println(personStack);

        personStack.sort();
        System.out.println(personStack);
    }
}
