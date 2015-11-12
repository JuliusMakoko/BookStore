/**
 * Created by nn on 10/11/2015.
 */
import java.util.*;

public class Provider extends Customer{

    private float rating;
    private int experienceYears;

    private ArrayList<WrittenWork> products = new ArrayList<>();


    public Provider (String id,String name, String address, String birthDate, Double phoneNumber, String eMail,int experienceYears,float rating)
    {
       this.rating =0;
       this.experienceYears=0;
    }

    public float getRating() {
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

    public String toString() {
        return getName();
    }// to string





}
