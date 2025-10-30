class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;     
        this.author = author;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Title : " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year  : " + this.year);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell", 1949);

        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();
    }
}

