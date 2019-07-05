package com.stackroute.exercise5;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentTest {


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStudent() {

        List<Student> students = new ArrayList<>();
        Student obj1 = new Student(1, "Ajay", 27);
        Student obj2 = new Student(2, "Sneha", 23);
        Student obj3 = new Student(3, "Simran", 37);
        Student obj4 = new Student(4, "Ajay", 22);
        Student obj5 = new Student(5, "Ajay", 29);
        Student obj6 = new Student(6, "Sneha", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);

        //BEFORE SORTING

        // [Student{id=1, name='Ajay', age=27}, Student{id=2, name='Sneha', age=23}, Student{id=3, name='Simran', age=37}, Student{id=4, name='Ajay', age=22}, Student{id=5, name='Ajay', age=29}, Student{id=6, name='Sneha', age=22}]

        Collections.sort(students,new StudentSorter());

        // After Sorting

        String expected="[Student{id=3, name='Simran', age=37}, Student{id=5, name='Ajay', age=29}, Student{id=1, name='Ajay', age=27}, Student{id=2, name='Sneha', age=23}, Student{id=6, name='Sneha', age=22}, Student{id=4, name='Ajay', age=22}]";
        assertEquals(expected, students.toString());


    }

    @Test
    public void testStudentSameStartingLetter() {

        List<Student> students = new ArrayList<>();
        Student obj1 = new Student(1, "Ajay", 27);
        Student obj2 = new Student(2, "Asmi", 23);
        Student obj3 = new Student(3, "Ashu", 37);
        Student obj4 = new Student(4, "Ajay", 22);

        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);


        //BEFORE SORTING

        // [Student{id=1, name='Ajay', age=27}, Student{id=2, name='Sneha', age=23}, Student{id=3, name='Simran', age=37}, Student{id=4, name='Ajay', age=22}, Student{id=5, name='Ajay', age=29}, Student{id=6, name='Sneha', age=22}]

        Collections.sort(students,new StudentSorter());

        // After Sorting

        String expected="[Student{id=3, name='Ashu', age=37}, Student{id=1, name='Ajay', age=27}, Student{id=2, name='Asmi', age=23}, Student{id=4, name='Ajay', age=22}]";
        assertEquals(expected, students.toString());


    }

}
