import java.util.ArrayList;

/**
 * Created by Rotem on 12/11/2015.
 */
public class Periodical extends WrittenWork {

    private Frequency frequency;

    public Periodical(String title, double price, String description, Genre genre, Frequency frequency, ArrayList<Provider> sellers) {
        super(title, price, description, genre, sellers);

        this.frequency = frequency;
    }

}
