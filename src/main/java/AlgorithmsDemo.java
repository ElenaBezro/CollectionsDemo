import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(4);
        integerList.add(20);
        integerList.add(15);
        integerList.add(100);

        Collections.sort(integerList);

        for (Integer value: integerList) {
            System.out.println(value);
        }

        System.out.println("******");

        List<Integer> unshuffledList = new ArrayList<>();
        unshuffledList.add(1);
        unshuffledList.add(2);
        unshuffledList.add(3);
        unshuffledList.add(4);
        unshuffledList.add(5);

        Collections.shuffle(unshuffledList);

        for (Integer value: unshuffledList) {
            System.out.println(value);
        }
        System.out.println("******");

        List<Integer> searchingList = Arrays.asList(1, 2, 3, 40, 50, 60, 70, 80);

        int searchResultIndex = Collections.binarySearch(searchingList, 40);
        System.out.println("index: " + searchResultIndex + " value: " + searchingList.get(searchResultIndex));
        System.out.println("******");

        List<Integer> integers = Arrays.asList(10, 29, 3, 4, 6, 6, 6, 80);
        System.out.println(Collections.frequency(integers, 6));
        System.out.println("******");


        List<Integer> firstIntegers = Arrays.asList(10, 29, 3, 4, 6, 6, 6, 80);
        //List<Integer> secondIntegers = Arrays.asList(10, 29, 3, 4, 6, 6, 6, 80);
        List<Integer> secondIntegers = Arrays.asList(1, 2, 5, 8);
        boolean hasElementNotCommon = Collections.disjoint(firstIntegers, secondIntegers);
        System.out.println(hasElementNotCommon);
        System.out.println("******");

        //max and min value using Collections


    }
}
