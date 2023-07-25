package org.example;

public interface IBookWarehouse {
    public void searchByAuthor(String author);

    int compareTo(Book other);
}
