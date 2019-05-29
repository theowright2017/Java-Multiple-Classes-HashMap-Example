import java.util.*;

public class Library {

    private ArrayList<EachBook> collection;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<EachBook>();
    }

    public int countBooks() {
        return this.collection.size();
    }


    public void addBook(EachBook book) {
        if (this.countBooks() < this.capacity) {
            this.collection.add(book);
        }
    }

    public EachBook removeBookFromStock() {
        EachBook bookForRental = this.collection.remove(0);
        return bookForRental;
    }

//    public int countBooksByGenre(EachBook book) {
//        return ;
//    }

    public HashMap countBooksByGenre() {
        HashMap<EachBook, Integer> countGenres = new HashMap<EachBook, Integer>();
        for (EachBook genre: collection) {
            Integer count = countGenres.get(genre);
            countGenres.put( genre, (count == null) ? 1 : count + 1);


        }
        return countGenres;
    }



}
