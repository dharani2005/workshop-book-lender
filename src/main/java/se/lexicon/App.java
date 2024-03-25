package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        Person erik = new Person("erik","lithvik");
        Book java = new Book("javabook","mehrdad",erik);
        //Book javascript = new Book("javabook","mehrdad");

        erik.loanBook(java);
        //erik.loanBook(javascript);
        System.out.println(erik.getPersonInformation());
        System.out.println(java.getBookInformation());
        //System.out.println(javascript.getBookInformation());
        //erik.returnBook(javascript);
        erik.returnBook(java);
        System.out.println(erik.getPersonInformation());
        System.out.println(java.getBookInformation());
        //System.out.println(javascript.getBookInformation());


        // Create a book instance
        // Display book information

        // Create a person instance
        // Display person information

        // Loan a book to the person

        // Display person information after borrowing a book
        // Display book information after borrowing a book

        // Return the borrowed book

        // Display person information after returning the book
        // Display book information after borrowing a book

    }

}
