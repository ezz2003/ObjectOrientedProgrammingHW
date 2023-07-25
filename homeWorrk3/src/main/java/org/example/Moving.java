package org.example;

public class Moving {

    public static void moveToW(PublicLibrary library, Warehouse warehouse, Book book) {
        /**
         * Передаёт книгу из читального зала в хранилище
         * @ param library - объект, из которого забираем книгу
         * @ param warehouse - объект - куда переносим книгу
         * @ param book      - объект книга, которую переносим
         */
        IMoveTo moveTo;
        moveTo = (Book book1) -> {
            warehouse.addBook(book1);
            library.removeBook(book.getTitle());
            return null;
        };
        moveTo.moveTo(book);
    }
    public static void moveToL(PublicLibrary library, Warehouse warehouse, Book book){
        /**
         * Передаёт книгу из хранилища в читальный зал
         * @ param warehouse - объект - из которого забираем книгу
         * @ param library - объект, куда переносим книгу
         * @ param book      - объект книга, которую переносим
         */

        IMoveTo moveTo2;
        moveTo2 = (Book book2) -> {
            library.addBook(book2);
            warehouse.removeBook(book.getTitle());
            return null;
        };
        moveTo2.moveTo(book);
    }
}
