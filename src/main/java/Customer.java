import java.util.ArrayList;

public class Customer {

    private ArrayList<EachBook> rentedBooks;
    private String name;

    public Customer(String name){
        this.name = name;
        this.rentedBooks = new ArrayList<EachBook>();
    }


    public int countMyRentedBooks() {
        return this.rentedBooks.size();
    }

    public void addRentedBook(EachBook book) {
        this.rentedBooks.add(book);
    }

    public void rentBookFromLibrary(Library library) {
        EachBook bookToBeRented = library.removeBookFromStock();
        this.addRentedBook(bookToBeRented);


    }
}
