package epam_intro_online.module_4.ClassesAndObject.Task9_Book;


public class Main {
    public static void main(String[] args) {
        Book[] book = {
                new Book("Dan Braun", "Inferno", "Arista", 2009, 378, 24, 'A'),
                new Book("Aleksandr Duma", "The Three Musketeers", "Kimki", 2003, 412, 20, 'B'),
                new Book("Dan Braun", "Angels and Demons", "Vista", 2010, 394, 28, 'C'),
                new Book("Aleksandr Duma", "The Count of Monte Cristo", "Kimki", 2009, 348, 23, 'V'),
                new Book("Conan Doyle", "The Adventures of Sherlock Holmes", "LondonPublishing", 2012, 512, 37, 'C'),
                new Book("Dan Braun", "The Da Vinci Code", "Arista", 2011, 432, 32, 'A'),
        };
        String author = "Dan Braun";
        String publishingHouse = "Kimki";
        int yearOfPublishing = 2009;


        System.out.println("Find book by author " + author + " :");
        BookLogic.print(BookLogic.findBooksInAuthor(book, author));
        System.out.println("Find book by publishing house " + publishingHouse + " :");
        BookLogic.print(BookLogic.findBooksInPublishingHouse(book, publishingHouse));
        System.out.println("Find book after year " + yearOfPublishing + " :");
        BookLogic.print(BookLogic.findBooksAfterYear(book, yearOfPublishing));
    }
}
