package com.sheva.util;

import com.sheva.domain.Student;

import java.util.TreeSet;

public class StudentPrint {

    public static void printStudentsSet(TreeSet<Student> students){

        for (Student tempStudent : students) {
            System.out.println(tempStudent);
        }
    }
    public static void printEvenNumberStudent(TreeSet<Student> s){

        for (Student tempStudent : s) {
            int i = tempStudent.getStudentListNumber();
            if(i % 2 == 0)
                System.out.println(tempStudent);
        }
    }
}
