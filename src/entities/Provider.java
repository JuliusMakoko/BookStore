package entities; /**
 */

import java.util.*;

public class Provider extends Customer {

    private double rating;
    private int experienceYears;

    private ArrayList<WrittenWork> products = new ArrayList<>();

    /**
     * Default constructor
     */
    public Provider() {
        super();
        rating = 0.0;
        experienceYears = 0;
    }

    /**
     * Constructor
     * @param id must be 9 digits long
     * @param name customer's name
     * @param address customer's address
     * @param birthDate customer's address to gather age
     * @param phoneNumber customer's phone number
     * @param email customer's email
     * @param subscriptions customer's list of subscriptions to periodicals
     * @param gender customer's gender
     * @param experienceYears Seller's years of experience
     * @param rating user ratings
     */
    public Provider(String id, String name, String address, Date birthDate, String phoneNumber, String email, ArrayList<Periodical> subscriptions, Gender gender, int experienceYears,float rating)
    {
        super(id, name, address, birthDate, phoneNumber, email, subscriptions, gender);
        this.rating = rating;
        this.experienceYears = experienceYears;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void addProduct(WrittenWork product) {
        products.add(product);
    }

    public void removeProduct(String productId) {

    }



}
