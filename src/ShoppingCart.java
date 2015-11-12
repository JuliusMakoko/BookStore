import java.util.ArrayList;

/**
 * Created by nn on 12/11/2015.
 */
public class ShoppingCart {


    private ArrayList<Purchase> purchases = new ArrayList<>();
    private Customer owner;

    public ShoppingCart(Customer owner) {
        this.owner = owner;
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }


}
