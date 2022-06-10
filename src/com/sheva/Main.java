package com.sheva;

import com.sheva.domain.Book;
import com.sheva.domain.BookFields;
import com.sheva.domain.Student;
import com.sheva.domain.User;
import com.sheva.util.BooksGeneration;
import com.sheva.util.BooksSorting;
import com.sheva.util.StudentSetGeneration;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static com.sheva.util.BooksPrint.printBooksList;
import static com.sheva.util.BooksPrint.printBooksSet;
import static com.sheva.util.BooksPrint.printBooksStartingWithVowel;
import static com.sheva.util.FriendListGeneration.addFriends;
import static com.sheva.util.FriendListGeneration.friendsGenerator;
import static com.sheva.util.StudentPrint.printEvenNumberStudent;
import static com.sheva.util.StudentPrint.printStudentsSet;
import static com.sheva.util.StudentSetGeneration.deleteOddNumberStudent;
import static com.sheva.util.UserFriendPrint.printMoreFriends;

public class Main {
    public static void main(String[] args) {


        /* List with books is created.
         * @param booksListCount is a number of book objects in List.
         * */
        int booksListCount = 20;
        List<Book> booksLinkedList = BooksGeneration.generateBooksList(booksListCount);
        printBooksList(booksLinkedList);

        /* The book number 7 is deleted.
         * @param deleteBook is an object we delete.
         * */
        int deleteBook = 7;
        booksLinkedList.remove(deleteBook);
        printBooksList(booksLinkedList);

        /* Set with books is created.
         * @param bookSetCount is a number of book objects in Set.
         * @param repeatingBooks is a number of the same book objects in Set.
         * */
        int bookSetCount = 25;
        int repeatingBooks = 6;
        Set<Book> bookSet = BooksGeneration.generateBooksSet(bookSetCount, repeatingBooks);
        printBooksStartingWithVowel(bookSet);

        /* Set with books is sorted.
         * If you want to sort by surname, you need to add a SURNAME to the method parameters.
         * If you want to sort by name, you need to add a NAME to the method parameters.
         * If you want to sort by patronymic, you need to add a PATRONYMIC to the method parameters.
         * */
        Set<Book> bookSortedBySurname = BooksSorting.bookSorting(bookSet, BookFields.SURNAME);
        Set<Book> bookSortedByName = BooksSorting.bookSorting(bookSet, BookFields.NAME);
        Set<Book> bookSortedByPatronymic = BooksSorting.bookSorting(bookSet, BookFields.PATRONYMIC);

        printBooksSet(bookSortedBySurname);
        printBooksSet(bookSortedByName);
        printBooksSet(bookSortedByPatronymic);

        /* TreeSet with students is created.
         * @param countStudent is a number of student objects in TreeSet.
         * */
        int countStudent = 10;
        TreeSet<Student> studentsSet = StudentSetGeneration.studentTreeSetGenerator(countStudent);

        printStudentsSet(studentsSet);
        printEvenNumberStudent(studentsSet);

        deleteOddNumberStudent(studentsSet);
        printStudentsSet(studentsSet);

        /* List of friends of friends is created
         * @param count is a number of user's friends.
         * @param level is a number of attachments of friends to friends.
         * */
        User mainUser = new User();

        int count = 5;
        int level = 4;

        mainUser.setFriends(friendsGenerator(count));
        addFriends(mainUser, count, level);

        printMoreFriends(mainUser, level);

    }
}
