package com.sheva.util;

import com.sheva.domain.Book;
import com.sheva.domain.BookFields;

import java.util.Set;
import java.util.TreeSet;


public class BooksSorting {


    public static Set<Book> bookSorting(Set<Book> set, BookFields field) {

        Set<Book> sortBook = null;
        switch (field) {
            case SURNAME: {
                sortBook = new TreeSet<>((o1, o2) -> o1.getAuthorSurname().compareTo(o2.getAuthorSurname()));
                break;
            }
            case NAME: {
                sortBook = new TreeSet<>((o1, o2) -> o1.getAuthorName().compareTo(o2.getAuthorName()));
                break;
            }
            case PATRONYMIC: {
                sortBook = new TreeSet<>(((o1, o2) -> o1.getAuthorPatronymic().compareTo(o2.getAuthorPatronymic())));
                break;
            }
            default:
                System.out.println("Wrong field");
        }

        sortBook.addAll(set);

        return sortBook;
    }


}
