import java.util.ArrayList;

public class Library {
    //    Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
//    Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его
//    в каталог библиотеки.
//    Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его
//    из каталога библиотеки.
//    Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль
//    информацию о доступных книгах в библиотеке.
//    Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве
//    параметра и выводит на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
    private ArrayList<Book> catalog;

    public Library(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }

    public Library() {
    }

    public void addBook(Book book){
        catalog.add(book);
    }
    public void removeBook(String title){
        for (int i = 0; i < this.catalog.size(); i++) {
            if (this.catalog.get(i).getTitle().equals(title)){
                this.catalog.remove(this.catalog.get(i));
            }
        }
    }

    public void displayAvailableBooks(){
        for(Book book: this.catalog){
            if (book.isAvailable()){
                book.displayInfo();
            }
        }
    }
    public void searchByAuthor(String author){
        for(Book book: this.catalog) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        }
    }

}
