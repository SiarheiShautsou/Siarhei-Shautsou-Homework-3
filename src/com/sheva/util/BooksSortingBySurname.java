package com.sheva.util;

import com.sheva.domain.Book;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BooksSortingBySurname {


    public static Set<Book> bookSorting(Set<Book> set, String s){

        Set<Book> sortBook = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorSurname().compareTo(o2.getAuthorSurname());
            }
        });

        sortBook.addAll(set);

        return sortBook;
    }
    public static Set<Book> bookSorting(Set<Book> set, int n){

        Set<Book> sortBook = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorName().compareTo(o2.getAuthorName());
            }
        });

        sortBook.addAll(set);

        return sortBook;
    }

    public static Set<Book> bookSorting(Set<Book> set, boolean b){

        Set<Book> sortBook = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorPatronymic().compareTo(o2.getAuthorPatronymic());
            }
        });

        sortBook.addAll(set);

        return sortBook;
    }


}
