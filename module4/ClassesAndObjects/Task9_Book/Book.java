package epam_intro_online.module_4.ClassesAndObject.Task9_Book;

public class Book {

    private int id = 0;
    private String author;
    private String bookTitle;
    private String publishingHouse;
    private int yearOfPublishing;
    private int countOfPages;
    private int price;
    private char bindingType;
    static int count = 0;

    public Book(String author, String bookTitle, String publishingHouse, int yearOfPublishing, int countOfPages,
                int price, char bindingType) {
        count++;
        this.id = count;
        this.author = author;
        this.bookTitle = bookTitle;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.countOfPages = countOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getBindingType() {
        return bindingType;
    }

    public void setBindingType(char bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", countOfPages=" + countOfPages +
                ", price=" + price +
                ", bindingType=" + bindingType +
                '}';
    }
}