package com.shruti.java8Features;

import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

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
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class SortCustomObject {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("Abby", 35)
        );

        // Sort the list in descending order
        Collections.sort(people, (o1, o2) -> o2.getAge()-o1.getAge()); //sort by asc o1.getAge()-o2.getAge()

        // Sort by age using Comparator and streams
        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())  // Sort by age ascending remove reversed()
                .collect(Collectors.toList());

        // Sort by age first, then by name (ascending)
        List<Person> sortedByAgeThenName = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getName))  // Secondary sort by name
                .collect(Collectors.toList());

        System.out.println("Sorted by age then name: " + sortedByAgeThenName);
        System.out.println("Sorted by Collections.sort: " + people);
        System.out.println("Sorted by age: " + sortedByAge);
    }
}

/*      output:
        Sorted by age then name: [Bob (25), Alice (30), Abby (35), Charlie (35)]
        Sorted by Collections.sort: [Charlie (35), Abby (35), Alice (30), Bob (25)]
        Sorted by age: [Charlie (35), Abby (35), Alice (30), Bob (25)]
*/

