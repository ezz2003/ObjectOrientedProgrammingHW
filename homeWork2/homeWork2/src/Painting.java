public class Painting implements IVisualArt{

    private String title;
    private String author;
    private boolean available;

    public Painting(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public Painting() {
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
