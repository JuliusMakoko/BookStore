/**
 * Created by Rotem on 12/11/2015.
 */
public class Periodical extends WrittenWork {

    private int issue;

    private Frequency frequency;

    public Periodical(String title, double price, String description, Genre genre, int issue, Frequency frequency) {
        super(title, price, description, genre);

        this.issue = issue;
        this.frequency = frequency;
    }

}
