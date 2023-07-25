package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class PublicLibrary implements IBookWarehouse, IBookReadingRoom, Comparator{

    private ArrayList<Book> catalog;

    public PublicLibrary(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }

    public PublicLibrary() {
    }

    public void addBook(Book book){
        if (!this.catalog.contains(book)){
            catalog.add(book);
        }
//        catalog.add(book);

    }

    public Book searchByTitle(String title){
        for(Book book: this.catalog) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void sortBook(String field){
        switch (field){
            case ("title"):
                Comparator<Book> titleComparator = new Comparator<Book>() {
                    @Override
                    public int compare(Book b1, Book b2) {
                        return b1.getTitle().compareTo(b2.getTitle());
                    }
                };
                Collections.sort(this.catalog, titleComparator);
                break;
            case ("author"):
                Comparator<Book> authorComparator = new Comparator<Book>() {
                    @Override
                    public int compare(Book b1, Book b2) {
                        return b1.getAuthor().compareTo(b2.getAuthor());
                    }
                };
                Collections.sort(this.catalog, authorComparator);
                break;
            default:
                System.out.println("invalid field class <PublicLibrary> - sortBook");
                break;
        }

    }

    @Override
    public void removeBook(String title){
        for (Iterator i = this.catalog.iterator(); i.hasNext();) {
            Book book = (Book) i.next();
            if (book.getTitle().equals(title)) {
                i.remove();
            }
        }
    }

    @Override
    public void displayAvailableExhibit(){
        System.out.println("---------Now print list of books in the Reading Room------------");
        for(Book book: this.catalog){
            if (book.isAvailable()){
                System.out.println(book.displayInfo());
            }
        }
    }
    @Override
    public void searchByAuthor(String author){
        for(Book book: this.catalog) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.displayInfo());
            }
        }
    }

    @Override
    public int compareTo(Book other) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

}
