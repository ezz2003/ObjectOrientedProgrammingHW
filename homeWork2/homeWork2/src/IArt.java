public interface IArt {

    public void setTitle(String title);

    public void setAuthor(String author);

    default String answerAvailable(boolean x){
        return x ? "available": "not available";
    }
}
