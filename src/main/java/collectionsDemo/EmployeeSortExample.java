package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Lena", 35));
        employeeList.add(new Employee("Lena", 18));
        employeeList.add(new Employee("Lena", 50));

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(employeeList);
    }
}

class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
//TODO: we can implement toCompare here and you
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    @Override
    public String toString() {
        return "collectionsDemo.mobilePhone.Employee {age="  + age + ", name=" + name +"}";
    }
}
