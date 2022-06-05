package com.sheva.domain;

import java.util.Objects;

public class Student implements Comparable<Student> {

    public static final int DEFAULT_STUDENT_NUMBER = 0;

    public static final int DEFAULT_STUDENT_ID_NUMBER = 111111;

    private int studentListNumber;

    private String studentSurname;

    private String studentName;

    private int studentIDNumber;

    public Student() {
        this.studentListNumber = DEFAULT_STUDENT_NUMBER;
        this.studentSurname = "Иванов";
        this.studentName = "";
        this.studentIDNumber = DEFAULT_STUDENT_ID_NUMBER;

    }

    public Student(int studentListNumber, String studentSurname, String studentName, int studentIDNumber) {
        this.studentListNumber = studentListNumber;
        this.studentSurname = studentSurname;
        this.studentName = studentName;
        this.studentIDNumber = studentIDNumber;
    }

    public int getStudentListNumber() {
        return studentListNumber;
    }

    public void setStudentListNumber(int studentListNumber) {
        this.studentListNumber = studentListNumber;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentIDNumber() {
        return studentIDNumber;
    }

    public void setStudentIDNumber(int studentIDNumber) {
        this.studentIDNumber = studentIDNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentListNumber == student.studentListNumber && studentIDNumber == student.studentIDNumber &&
                Objects.equals(studentSurname, student.studentSurname) && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentListNumber, studentSurname, studentName, studentIDNumber);
    }

    @Override
    public String toString() {
        return "Student{" + "studentListNumber=" + studentListNumber + ", studentSurname='" + studentSurname + '\''
                + ", studentName='" + studentName + '\'' + ", studentIDNumber=" + studentIDNumber + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentListNumber - o.studentListNumber;
    }
}
