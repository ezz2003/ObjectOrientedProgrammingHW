public class Book {
//    Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и
//    автора книги соответственно.
//    Приватное поле "доступность" (available) типа boolean для указания доступности книги.
//    Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
//    Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
//    Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге
//    (название, автор, доступность).
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public Book() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void displayInfo(){
        System.out.printf("BOOK: %s. AUTHOR: %s. AVIALABLE: %s\n", this.title, this.author,
                this.available ? "available": "not available");
    }
}
