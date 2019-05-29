import java.util.HashMap;

public class EachBook {

    private String title;
    private String author;
    private String genre;
//    private HashMap<String, String> booksByGenre = new HashMap<String, String>();

    public EachBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
