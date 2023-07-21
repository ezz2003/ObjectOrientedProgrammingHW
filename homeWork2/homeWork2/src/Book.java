public class Book extends ArtElement{

    private int age;

    public Book(String title, String author, boolean available, int age) {
        super(title, author, available);
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
    @Override
    public boolean isAvailable() {
        return super.isAvailable();
    }
    @Override
    public String displayInfo(){
        return String.format("BOOK: %s. AUTHOR: %s. Available: %s", getTitle(),
                getAuthor(), this.answerAvailable(isAvailable()));
    }
}
