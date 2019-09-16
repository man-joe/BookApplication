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


public class Book {
    private String title, author, description;
    private double price;
    private int numInStock; //isInStock variable

    public Book() {
        System.out.println("You made a book instance. GJ.");
        this.title = "";
        this.author = "";
        this.description = "";
        this.price = 0.0;
        this.numInStock = 0;
    }

    public Book(String title, String author, String description, double price, int numInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.numInStock = numInStock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    public void getDisplayText() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }
}
