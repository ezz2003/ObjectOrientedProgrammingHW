package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Warehouse implements IBookWarehouse {

    private ArrayList<Book> storage;

    public Warehouse(ArrayList<Book> storage) {
        this.storage = storage;
    }

    public Warehouse(){

    }

    public void addBook(Book book){
        if (!this.storage.contains(book)){
            storage.add(book);
        }
    }

    public void removeBook(String title){
        for (Iterator i = this.storage.iterator(); i.hasNext();) {
            Book book = (Book) i.next();
            if (book.getTitle().equals(title)) {
                i.remove();
            }
        }
    }

    public void displayListSorage(){
        System.out.println("---------Now print list of books in the Storage------------");
        for(Book book: this.storage){
            if (book.isAvailable()){
                System.out.println(book.displayInfo());
            }
        }
    }

    @Override
    public void searchByAuthor(String author) {
        for(Book book: this.storage) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.displayInfo());
            }
        }
    }

    @Override
    public int compareTo(Book other) {
        return 0;
    }

    public Book searchByTitle(String title) {
        for(Book book: this.storage) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
