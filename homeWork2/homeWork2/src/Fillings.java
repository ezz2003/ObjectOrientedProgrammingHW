import java.util.ArrayList;
import java.util.List;

public class Fillings {
    public static class FillingBooks {
        public static Library fil(){
            Book book1 = new Book("The Case of the Sulky Girl", "Erle Stanley Gardner", true, 3);
            Book book2 = new Book("The Case of the Lazy Lover", "Erle Stanley Gardner", true, 1);
            Book book3 = new Book("The Rubber Band", "Rex Stout", true, 5);
            Book book4 = new Book("The Case of the Stuttering Bishop", "Erle Stanley Gardner", false, 4);
            Library library = new Library(new ArrayList<>(List.of(book3)));
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book4);
            library.addBook(new Book(" Champagne for One","Rex Stout", true, 7));
            return library;
        }
    }
}


