public class Main {

    public static void main(String[] args) {
        Library library = Fillings.FillingBooks.fil();
        library.addBook(new Book(" Champagne for One","Rex Stout", true, 7));

        library.displayAvailableExhibit();
        System.out.println();
        library.searchByAuthor("Rex Stout");
        System.out.println();
        library.removeBook("The Case of the Lazy Lover");
        library.displayAvailableExhibit();
    }
}