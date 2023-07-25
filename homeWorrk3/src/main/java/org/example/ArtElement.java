package org.example;

public abstract class ArtElement implements IPublications{
    private String title;
    private String author;
    private boolean available;

//    private int age;

    public ArtElement(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
//        this.age = age;
    }

    public ArtElement() {
    }

    @Override
    public abstract void setTitle(String title);

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
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

    public abstract String displayInfo();
}
