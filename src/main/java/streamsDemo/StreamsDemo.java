package streamsDemo;

import java.util.*;

public class StreamsDemo {
    //Exercise 1.
    //Objective: Imagine you have a list of integer numbers. Your task is to filter out all even numbers from this list and create a new list containing only the odd numbers.
    //Expected Outcome: Given a list like [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], your output should be [1, 3, 5, 7, 9].
    //Bonus: Return the sum of the filtered odd numbers.
    public Integer sumOfOddNumbers(List<Integer> list) {
        List<Integer> filtered = list.stream().filter(e -> e % 2 != 0).toList();
        System.out.println("Filtered List " + filtered);
        return filtered.stream().reduce(0, (acc, elem) -> acc + elem);
    }

    //Exercise 2.
    //Objective: You are given a list of words in lowercase. Your challenge is to transform each word into its uppercase counterpart.
    //Expected Outcome: Given a list like ["hello", "world", "streams", "java"], the transformed list should be ["HELLO", "WORLD", "STREAMS", "JAVA"].
    //Bonus: Count the number of characters in the transformed list (excluding spaces).

    public List<String> convertToUpperCase(List<String> list) {
        return list.stream().map(string -> string.toUpperCase()).toList();
    }

    public int charCount(List<String> list) {
        return list.stream().map(string -> string.length()).reduce(0, (acc, length) -> acc + length);
    }

    //Exercise 3.
    //Objective: You have a list of integers. Calculate the sum of all these integers.
    //Expected Outcome: Given a list like [1, 2, 3, 4, 5], the computed sum should be 15.
    //Bonus: Find the average of the list.
    public Integer sumOfNumbers(List<Integer> list) {
        return list.stream().reduce(0, (acc, number) -> acc + number);
    }

    //Exercise 4.
    //Objective: Join all strings from a given list into a single string. These words should be separated by commas in the resulting string.
    //Expected Outcome: From a list such as ["apple", "banana", "cherry"], the resulting string should be "apple,banana,cherry".
    //Bonus: Reverse the order of the words in the resulting string. So, for the list ["apple", "banana", "cherry"], the resulting string would be "cherry,banana,apple".

    public String joinWithComma(List<String> list) {
        //return String.join(", ", list);
        StringBuilder result = new StringBuilder();

        list.stream().forEach(e -> result.append(", ").append(e));
        return result.substring(2);
    }

    public String reverseString(List<String> list) {
        StringBuilder result = new StringBuilder();

        list.stream().forEach(string -> result.insert(0, ", ").insert(0, string));
        return result.toString().substring(0, result.length() - 2);
    }

    //Exercise 5.
    //Objective: Given a list of words, count how many words have more than 3 characters.
    //Expected Outcome: For a list like ["cat", "elephant", "dog", "dolphin"], the count should be 2 since "elephant" and "dolphin" have more than 3 characters.
    //Bonus: Return the shortest word from the list.
    public int longWordCount(List<String> list) {
        return list.stream().filter(string -> string.length() > 3).toList().size();
    }

    public Optional<String> shortestWord(List<String> list) {
        return list.stream().reduce((acc, str) -> acc.length() > str.length() ? str : acc);
    }

        public static void main(String[] args) {
        Employee employee1 = new Employee("Lena", 35);
        Employee employee2 = new Employee("Lena", 30);
        Employee employee3 = new Employee("Lena", 18);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        int count = 1;

        int ageSum = list.stream().map(Employee::getAge).reduce(0, (acc, age) -> acc + age);
        System.out.println("Average age: " + ageSum / list.size());

        int result = list.stream()
                .reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        System.out.println("*******");

        StreamsDemo demo = new StreamsDemo();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int oddNumbersSum = demo.sumOfOddNumbers(numbers);
        System.out.println("Odd numbers sum: " + oddNumbersSum);
        System.out.println("*******");

        List<String> strings = Arrays.asList("lena", "nona", "sara", "eva");
        List<String> upperCasedStrings = demo.convertToUpperCase(strings);
        System.out.println(upperCasedStrings);
        System.out.println("Char count: " + demo.charCount(upperCasedStrings));
        System.out.println("*******");


        int sumOfNumbers = demo.sumOfNumbers(numbers);
        System.out.println("Sum of numbers: " + sumOfNumbers);
        int averageNumber = sumOfNumbers / numbers.size();
        System.out.println("Average: " + averageNumber);
        System.out.println("*******");


        String joined = demo.joinWithComma(strings);
        String joinedReversed = demo.reverseString(strings);
        System.out.println("Joined: " + joined);
        System.out.println("Joined and reversed: " + joinedReversed);
        System.out.println("*******");

        System.out.println("Count words with more then 3 chars: " + demo.longWordCount(strings));
        System.out.println("Shortest word: " + demo.shortestWord(strings));

    }
}

class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
