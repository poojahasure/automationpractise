package org.collection;

class Tester{
    public String authorName;  //instance variable
    public Tester(String authorName) {  //constructor
        this.authorName=authorName;
    }
}
class Book{
    public String bookName;
    public Tester authorObj; // Book has Author
    public Book(String bookName,Tester authorObj) {
        this.bookName=bookName;
        this.authorObj=authorObj;
    }
    public void displayDetails() {
        System.out.println(this.bookName+" is written by "+authorObj.authorName);
    }
}
public class Tester{
    public static void main(String[] args) {
        Tester obj1=new Tester("Chetan");
        Book obj2=new Book("Half girl friend",obj1);
        obj2.displayDetails();
    }
}   
