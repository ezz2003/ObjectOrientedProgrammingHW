package org.example;

public class Book extends ArtElement{

    private int age;
    private  int creation;

    public Book(String title, String author, boolean available, int creation, int age) {
        super(title, author, available);
        this.creation = creation;
        this.age = age;
    }

    public Book() {
    }

    @Override
    public void setTitle(String title) {
        title = title;
    }

    public int getAge() {
        return age;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public boolean isAvailable() {
        return super.isAvailable();
    }
    @Override
    public String displayInfo(){
        return String.format("BOOK: %-30.30s. AUTHOR: %-30.30s. Year of creation: %d. Available: %s", getTitle(),
                getAuthor(), getCreation(), this.answerAvailable(isAvailable()));
    }


    @Override
    public boolean equals(Object o) {
        var c = (Book) o;
        return this.getTitle() == c.getTitle() && this.age == c.getAge() && this.getAuthor() ==c.getAuthor();
    }


}
