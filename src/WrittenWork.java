/*
 * A class which dictates the basic fields
 * every product which is sold in our store, should hold
 */
import java.util.*;

public abstract class WrittenWork {

    protected String title;

    protected double price;

    protected String description;

    protected ArrayList<Provider> sellers = new ArrayList<>();

    protected Genre genre;

    protected WrittenWork(String title, double price, String description, Genre genre, ArrayList<Provider> sellers) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.genre = genre;
        this.sellers = sellers;
        for (Provider seller : sellers) {
            seller.addProduct(this);
        }
    }

    public double getPrice() {
        return price;
    }
}
