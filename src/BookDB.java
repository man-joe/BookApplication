/*
A book database class will contain a method to return a book object.
We haven't exactly learned how to create a database or read/write to files yet.
We're going to use the knowledge we already have to create a class. Our class will simulate
a database and return a populated book object. We'll simulate a database by simply using if
or switch statements to look up a book based on SKU. Later, we'll create a database using
Oracle that also returns a book object.

Our book database will contain several book titles and the SKU code to look one up.

Your assignment
Create a class that contains a method that takes one parameter, the SKU, and returns a corresponding
book object. Use If Statements to populate the instance variables of the Book class and return the
populated Book class.
 */

import java.util.HashMap;

public class BookDB {
    private HashMap<String, Book> theBookDB; //Database that will find Book objects based on SKU
    private Book b;

    public HashMap<String, Book> getTheBookDB() {
        return theBookDB;
    }

    public void setTheBookDB(HashMap<String, Book> theBookDB) {
        this.theBookDB = theBookDB;
    }

    public Book getB() {
        return b;
    }

    public void setB(Book b) {
        this.b = b;
    }

    public BookDB(){
        theBookDB = new HashMap<>();
        theBookDB.put("Java1001", new Book("Head First Java", "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", 47.50, 3));
        theBookDB.put("Java1002", new Book("Thinking in Java", "Bruce Eckel",
                "Details about Java under the hood", 20.00, 5));
        theBookDB.put("Orc11003", new Book("OCP: Oracle Certified Professional Java SE",
                "Jeanne Boyarsky", "Everything you  need to know in one place",
                45.00, 1));
        theBookDB.put("Python1004", new Book("Automate the Boring Stuff with Python", "Al Sweigart",
                "Fun with Python", 10.50, 2));
        theBookDB.put("Zombie1005", new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50,
                0));
        theBookDB.put("Rasp1006", new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris",
                "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, 7));
    }
    /*
    Next, you'll add an overloaded constructor and a method.
    An overloaded constructor is a constructor that takes one or more parameters. You can create multiple constructors
    as long as the parameter types and counts are unique. Create a constructor  in the BookDB  class that takes an SKU
    and populates the private member variables. The constructor by default will return the appropriate BookDB object
    when it is called. You do not need to include a return statement.

    Next, create a method in your Book class called getDisplayText(). It takes no parameters. When called it returns
    a string containing the author, title and description. Do not use System.out.print() in your class. Simply return
    the string and let the calling class handle the print statements. You can use this method to print your book
    information to the console or a file or a web page.
     */
    public BookDB(String sku) {
        this();
        b = this.getBook(sku);
    }

    public Book getBook(String sku) {
        return theBookDB.get(sku);
    }


}
