package org.example;

import java.util.ArrayList;

public class DemoLibrary {
    public static class demo{
        public static void demo(PublicLibrary publicLibrary){
            publicLibrary.displayAvailableExhibit();                  // печать всех доступных книг из читального зала
            System.out.println("**************demonstration of search by author****************\n");
            publicLibrary.searchByAuthor("Rex Stout");                // демонстрация поиска по автору

            publicLibrary.removeBook("The Case of the Lazy Lover");  // удаление книги
            System.out.println("**************printing after deleting a book***************\n");
            publicLibrary.displayAvailableExhibit();                      // печать после удаления
            System.out.println("************Sorting by Title***************\n");
            publicLibrary.sortBook("title");                          // сортировка по заголовку
            publicLibrary.displayAvailableExhibit();                       // печать после сортировки по заголовку
            System.out.println("**********Sorting by Author************\n");
            publicLibrary.sortBook("author");                         // сортировка по автору
            publicLibrary.displayAvailableExhibit();                       // печать после сортировки по автору
            Warehouse warehouse = new Warehouse(new ArrayList<>());
            Moving.moveToW(publicLibrary, warehouse, publicLibrary.searchByTitle("The Trial")); // перемещение книги из ЧЗ на склад
            Moving.moveToW(publicLibrary, warehouse, publicLibrary.searchByTitle("Champagne for One"));// перемещение книги из ЧЗ на склад
            System.out.println("**************Move to Warehouse two books***************\n");
            publicLibrary.displayAvailableExhibit();                                      // печать остатков в читальном зале
            warehouse.displayListSorage();                                          // печать остатков на складе
            Moving.moveToL(publicLibrary, warehouse, warehouse.searchByTitle("The Trial")); // перемещение книги со склада
                                                                                    // в читальный зал
            System.out.println("*************Back one book to Reading Room**************\n");
            publicLibrary.displayAvailableExhibit();                                      // печать остатков в читальном зале
            warehouse.displayListSorage();                                          // печать остатков на складе

        }
    }
}
