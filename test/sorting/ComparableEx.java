package com.test.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx {

    public static void main(String args[]) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student("Viru"));
        al.add(new Student("Saurav"));
        al.add(new Student("Mukesh"));
        al.add(new Student("Tahir"));

        Collections.sort(al);
        for (Student s : al) {
            System.out.println(s.name);
        }
    }


}

class Student implements Comparable<Student> {
    String name;
    Student(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Student o) {
        return o.name.compareTo(name);
    }
}
