package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class People {
    public static List<Person> createPeople() {

        return Arrays.asList(
                new Person("Sara", 20),
                new Person("Sara", 22),
                new Person("Bob", 20),
                new Person("Paula", 32),
                new Person("Paul", 32),
                new Person("Jack", 23),
                new Person("Jack", 72),
                new Person("Jill", 11));
    }

    public static void main(String[] args) {
        List<Person> people = People.createPeople();

        people.forEach(System.out::println);

        people.stream()
                .map(person -> person.getName())
                .forEach(System.out::println);

        people.stream()
                .filter(person -> person.getAge()>30)
                .forEach(System.out::println);

        System.out.println(
                people.stream()
                        .mapToInt(person -> person.getAge())
                        .sum());

        //To print the age of the group using reduce function.
        System.out.println("Age of the group using reduce "+
                people.stream()
                        .map(person -> person.getAge())
                        .reduce(0, (initial, personAge) -> initial+personAge ));

        //To reduce code verbosity
        System.out.println("Age of the group using reduce with less verbosity "+
                people.stream()
                        .map(person -> person.getAge())
                        .reduce(0, Integer::sum));

        //People above 30
        List<String> peopleAbove30;
        peopleAbove30 =	people.stream()
                .filter(person -> person.getAge() >30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .reduce( new ArrayList(),											//seed data
                        (names, name) -> {names.add(name); return names;},			//operation performed on partial result
                        (names1,names2)-> {names1.addAll(names2); return names1;});

        System.out.println("People above 30 #1: " + peopleAbove30);
        peopleAbove30 =	people.stream()
                .filter(person -> person.getAge() >30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("People above 30 #2: " + peopleAbove30);

        System.out.println(people.stream()
                .filter(person -> person.getAge() >30)
                .collect(Collectors.toMap(Person::getName, Person::getAge))
        );

        System.out.println(people.stream()
                .filter(person -> person.getAge() >30)
                .map(person -> person.getName().toUpperCase())
                .collect((Collectors.joining(", ")))
        );

        List<Person> evenAged = people.stream()
                .filter(person -> person.getAge()%2==0)
                .collect(Collectors.toList());

        List<Person> oddAged = people.stream()
                .filter(person -> person.getAge()%2!=0)
                .collect(Collectors.toList());
        System.out.println(evenAged);
        System.out.println(oddAged);

        Map<Boolean, List<Person>> peoplePartitioned =
                people.stream()
                        .collect(Collectors.partitioningBy(person -> person.getAge()%2==0));
        System.out.println(peoplePartitioned);

        Map<String, Long> countByName =
                people.stream()
                        .collect(
                                Collectors.groupingBy(
                                        person -> person.getName(),
                                        Collectors.mapping(Person::getAge, Collectors.counting())));

        System.out.println(countByName);


    }
}
