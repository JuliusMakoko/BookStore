/**
 * Created by nn on 10/11/2015.
 */
import java.util.*;

public class Provider extends Customer{

    private int experienceYears;

    private ArrayList<WrittenWork> products = new ArrayList<>();


    public Provider (String id,String name, String address, String birthDate, Double phoneNumber, String eMail,int experienceYears)
    {
       this.experienceYears=experienceYears;
    }
    public String toString() {
        return getName();
    }
/*
    public String getId() { return id; }
    public void setId(String myId) {this.id=myId; }

    public String getName () {return name;}
    public void setName (String myName) {this.name=myName;}

    public Double getPhoneNumber () {return phoneNumber;}
    public void setPhoneNumber (Double myPhoneNumber) {this.phoneNumber=myPhoneNumber;}

    public String geteMail () {return eMail;}
    public void seteMail (String myeMail) {this.eMail=myeMail; }*/




}
