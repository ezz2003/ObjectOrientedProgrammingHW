import java.util.ArrayList;

public class Library implements IBookWarehouse, IBookReadingRoom{

    private ArrayList<Book> catalog;

    public Library(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }

    public Library() {
    }

    public void addBook(Book book){
        catalog.add(book);
    }
    @Override
    public void removeBook(String title){
        for (int i = 0; i < this.catalog.size(); i++) {
            if (this.catalog.get(i).getTitle().equals(title)&&this.catalog.get(i).getAge()>MINAGE){
                this.catalog.remove(this.catalog.get(i));
            }
        }
    }
    @Override
    public void displayAvailableExhibit(){
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

}
