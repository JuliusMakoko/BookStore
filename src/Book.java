
public abstract class Book extends WrittenWork {

    protected String author;

    protected int pubYear;

    protected int edition;

    protected Book(String author, int pubYear, int edition, String title, double price, String description, Genre genre) {
        super(title, price, description, genre);
        this.author = author;
        this.pubYear = pubYear;
        this.edition = edition;
    }
}
