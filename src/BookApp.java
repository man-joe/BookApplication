/*
Create a project in IntelliJ called BookApplication.

Create a Book class that allows for Book title, author, description, price and isInStock variables

The Book class shall contain private member variables, a default constructor, an overloaded constructor
and a method called getDisplayText() which prints the author, title and description.

The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method. In the main method you shall create
an instance of a Book and print the Author, Title and Description.

Publish your solution to GitHub and submit your GitHub url as the assignment.
 */

import java.text.NumberFormat;
import java.util.Locale;

public class BookApp {
    private static NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Book1", "Author1", "Description1", 10.0, 5);

        b1.getDisplayText();
        b2.getDisplayText();

        System.out.println("Price of 5 books: " + fmt.format(b2.multipleBookPrice(5)));
        System.out.println("Price of 6 books: " + fmt.format(b2.multipleBookPrice(6)));

    }
}
