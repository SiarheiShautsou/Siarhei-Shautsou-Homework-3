package com.sheva.util;

import com.sheva.domain.Book;

import java.util.List;
import java.util.Set;

public class BooksPrint {

    public static void printBooksList(List<Book> list) {

        for (Book tempListBook : list) {
            System.out.println(tempListBook);
        }
    }

    public static void printBooksStartingWithVowel(Set<Book> set) {

        String[] vowels = {"А", "Е", "Ё", "И", "О", "Ю", "Я", "Э", "а", "е", "ё", "и", "о", "ю", "я", "э",
                "A", "E", "I", "U", "O", "Y", "a", "e", "i", "u", "o", "y"};

        for (Book tempSetBook : set) {
            String gettingName = tempSetBook.getBookName();
            for (int i = 0; i < vowels.length; i++) {
                if (gettingName.startsWith(vowels[i])) System.out.println(tempSetBook);

            }
        }
    }

    public static void printBooksSet(Set<Book> set){

        for (Book tempSet : set) {
            System.out.println(tempSet);

        }
    }
}
