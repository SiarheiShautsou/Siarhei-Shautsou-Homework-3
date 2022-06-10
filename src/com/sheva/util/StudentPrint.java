package com.sheva.util;

import com.sheva.domain.Student;

import java.util.Set;

public class StudentPrint {

    public static void printStudentsSet(Set<Student> students) {

        for (Student tempStudent : students) {
            System.out.println(tempStudent);
        }
    }

    public static void printEvenNumberStudent(Set<Student> s) {

        for (Student tempStudent : s) {
            int i = tempStudent.getStudentListNumber();
            if (i % 2 == 0) System.out.println(tempStudent);
        }
    }
}
