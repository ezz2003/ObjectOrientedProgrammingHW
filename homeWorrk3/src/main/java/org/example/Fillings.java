package org.example;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

public class Fillings {
    public static class FillingBooks {
        public static PublicLibrary fil(){
            Book book1 = new Book("The Case of the Sulky Girl", "Erle Stanley Gardner", true, 1933, 3);
            Book book2 = new Book("The Case of the Lazy Lover", "Erle Stanley Gardner", true, 1948,2);
            Book book3 = new Book("The Rubber Band", "Rex Stout", true, 1936,5);
            Book book4 = new Book("The Case of the Stuttering Bishop", "Erle Stanley Gardner", false, 1936,4);
            PublicLibrary publicLibrary = new PublicLibrary(new ArrayList<>(List.of(book3)));
            publicLibrary.addBook(book1);
            publicLibrary.addBook(book2);
            publicLibrary.addBook(book4);
            publicLibrary.addBook(new Book("Champagne for One","Rex Stout", true, 1958,7));
            publicLibrary.addBook(new Book("Ace Up My Sleeve", "James Hadley Chase", true, 1971,4));
            publicLibrary.addBook(new Book("The Trial", "Franz Kafka", true, 1925,5));
            publicLibrary.addBook(new Book("The Trial", "Franz Kafka", true, 1925,5));

            return publicLibrary;

        }
    }
}


