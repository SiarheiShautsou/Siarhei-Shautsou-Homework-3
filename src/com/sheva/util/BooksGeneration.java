package com.sheva.util;

import com.sheva.domain.Book;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static com.sheva.domain.BooksInfo.*;

public class BooksGeneration {

    public static List<Book> generateBooksList(int count) {

        List<Book> books = new LinkedList<>();

        for (int i = 0; i < count; i++) {

            int c = (int) (Math.random() * (booksNames.length - 1));

            books.add(new Book(booksNames[c], authorsSurnames[c], authorsNames[c], authorsPatronymic[c],
                    pagesNumbers[c], yearsPublishing[c]));

        }
        return books;
    }

    public static Set<Book> generateBooksSet(int countObject) {

        Set<Book> bookSet = new HashSet<>();

        int uniqueObjects = booksNames.length;

        for (int i = 0; i < uniqueObjects; i++) {

            bookSet.add(new Book(booksNames[i], authorsSurnames[i], authorsNames[i], authorsPatronymic[i], pagesNumbers[i], yearsPublishing[i]));

        }
        for (int i = uniqueObjects; i < countObject; i++) {

            bookSet.add(new Book());
        }
        return bookSet;
    }
}
