package entities;/*
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

    //default ctor
    public WrittenWork() {
    }

    //
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Provider> getSellers() {
        return sellers;
    }

    public void setSellers(ArrayList<Provider> sellers) {
        this.sellers = sellers;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
