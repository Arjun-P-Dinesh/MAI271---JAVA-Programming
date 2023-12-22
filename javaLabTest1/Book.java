//logic 
//read the input - book id , author, and title from user in book class
//by extending Book class create derived class RefrenceBook and FictionBook
//if user takes a book it should be marked as borrowed and if retured mark it as returned
//its for tracking thre books 
//New class periodical - which is extended from ReferenceBook CLass

import java.util.Scanner;
// Class - book with attributes bookId (integer), title (String),author (String) getting input from user
public class Book{
    public int bookId;
    public String title;
    public String author;
    public Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setBookId(int bookId){
        this.bookId = bookId;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
//derived class - Reference Book
// For ReferenceBook, introduce an additional attribute:
// - edition (int): the edition number of the reference book
class ReferenceBook extends Book{
    public int edition;
    public ReferenceBook(int bookId, String title, String author, int edition){
        super(bookId, title, author);
        this.edition = edition;
    }
    public int getEdition(){
        return edition;
    }
    public void setEdition(int edition){
        this.edition = edition;
    }
}
//derived class 2 - Fictional Book
// For FictionBook, include an extra attribute:
// -genre (String): the genre of the fiction book
class FictionBook extends Book{
    public String genre;
    public FictionBook(int bookId, String title, String author, String genre){
        super(bookId, title, author);
        this.genre = genre;
    }
    }
public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter book ID:");
       int bookId = scanner.nextInt();
       System.out.println("Enter book title:");
       String title = scanner.next();
       System.out.println("Enter book author:");
       String author = scanner.next();
       Book book = new Book(bookId, title, author);
       System.out.println("Enter book Edition:");
       int edition = scanner.nextInt();
       System.out.println("Book details:");
}
}
