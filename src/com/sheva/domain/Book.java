package com.sheva.domain;

import java.util.Objects;

public class Book {

    public static final int DEFAULT_PAGES_NUMBER = 200;

    public static final int DEFAULT_YEAR_PUBLISHING = 2000;

    private String bookName;

    private String authorSurname;

    private String authorName;

    private String authorPatronymic;

    private int pagesNumber;

    private int yearPublishing;

    public Book(){
        this.bookName = "Book";
        this.authorSurname = "Surname";
        this.authorName = "Name";
        this.authorPatronymic = "Patronymic";
        this.pagesNumber = DEFAULT_PAGES_NUMBER;
        this.yearPublishing = DEFAULT_YEAR_PUBLISHING;
    }

    public Book(String bookName, String authorSurname, String authorName, String authorPatronymic,
                int pagesNumber, int yearPublishing) {
        this.bookName = bookName;
        this.authorSurname = authorSurname;
        this.authorName = authorName;
        this.authorPatronymic = authorPatronymic;
        this.pagesNumber = pagesNumber;
        this.yearPublishing = yearPublishing;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesNumber == book.pagesNumber && yearPublishing == book.yearPublishing && Objects.equals(bookName, book.bookName)
                && Objects.equals(authorSurname, book.authorSurname) && Objects.equals(authorName, book.authorName)
                && Objects.equals(authorPatronymic, book.authorPatronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorSurname, authorName, authorPatronymic, pagesNumber, yearPublishing);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorPatronymic='" + authorPatronymic + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", yearPublishing=" + yearPublishing +
                '}';
    }
}
