/**
 * Created by Rotem on 10/11/2015.
 *
 * A class which dictates the basic fields
 * every product which is sold in our store, should hold
 */
public abstract class WrittenWork {

    protected String title;

    protected double price;

    protected String description;

    /*
    protected Seller[] sellers;
    */

    protected Genre genre;

    protected WrittenWork(String title, double price, String description, Genre genre) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.genre = genre;
    }
}
