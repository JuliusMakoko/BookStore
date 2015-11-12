/**
 * Created by nn on 10/11/2015.
 */
public class Customer {
    private String id;
    private String name;
    private String address;
    private String birthDate; // age
    private Double phoneNumber;
    private String eMail;
    private Boolean isSubscription;

    public  Customer()
    {
       this.isSubscription=false;
    }



    public String getId() { return id; }
    public void setId(String myId) {this.id=myId; }

    public String getName () {return name;}
    public void setName (String myName) {this.name=myName;}

    public String getAddress () {return address;}
    public void setAddress (String myAddress) {this.address=myAddress;}

    public String getBirthDate () {return birthDate;}
    public void setBirthDate (String myBirthDate) {this.birthDate=myBirthDate;}

    public Double getPhoneNumber () {return phoneNumber;}
    public void setPhoneNumber (Double myPhoneNumber) {this.phoneNumber=myPhoneNumber;}

    public String geteMail () {return eMail;}
    public void seteMail (String myeMail) {this.eMail=myeMail; }


}
