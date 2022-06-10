package com.sheva.util;

import com.sheva.domain.Student;

import java.util.Set;
import java.util.TreeSet;

import static com.sheva.util.NumberCheck.evenNumber;
import static com.sheva.util.StudentInfoGeneration.generatorID;
import static com.sheva.util.StudentInfoGeneration.nameGenerator;

public class StudentSetGeneration {

    public static TreeSet<Student> studentTreeSetGenerator(int count) {

        TreeSet<Student> students = new TreeSet<>();

        for (int i = 0; i < count; i++) {

            int studentNumber = i + 1;
            students.add(new Student(studentNumber, nameGenerator(), nameGenerator(), generatorID()));

        }

        return students;
    }


    public static void deleteOddNumberStudent(Set<Student> s) {

        TreeSet<Student> students = new TreeSet<>();

        for (Student tempStudent : s) {
            int listNumber = tempStudent.getStudentListNumber();
            if (evenNumber(listNumber)) {
                students.add(tempStudent);
            }
        }
        s.removeAll(students);
    }
}
