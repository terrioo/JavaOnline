package epam_intro_online.module_4.ClassesAndObject.Task9_Book;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

    public static List<Book> findBooksInAuthor(Book[] book, String author) {
        List<Book> listOfBooks = new ArrayList<>();
        for (Book book1 : book) {
            if (book1.getAuthor().equals(author)) {
                listOfBooks.add(book1);
            }
        }
        return listOfBooks;
    }

    public static List<Book> findBooksInPublishingHouse(Book[] book, String publishingHouse) {
        List<Book> listOfBooks = new ArrayList<>();
        for (Book book1 : book) {
            if (book1.getPublishingHouse().equals(publishingHouse)) {
                listOfBooks.add(book1);
            }
        }
        return listOfBooks;
    }

    public static List<Book> findBooksAfterYear(Book[] book, int year) {
        List<Book> listOfBooks = new ArrayList<>();
        for (Book book1 : book) {
            if (book1.getYearOfPublishing() > year) {
                listOfBooks.add(book1);
            }
        }
        return listOfBooks;
    }

    public static void print(List<Book> book) {
        for (Book book1 : book) {
            System.out.println(book1);
        }
    }
}
