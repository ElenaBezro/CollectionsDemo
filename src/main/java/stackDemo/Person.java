package stackDemo;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
            return Integer.compare(age, other.getAge());
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %d\n", name, age);
    }
}
