package model.backend.backend;

import entities.Book;
import entities.Customer;
import entities.Provider;
import entities.Purchase;

public interface Backend {

    //add
    public void addBook (Book book) throws Exception;
    public void addCustomer (Customer customer) throws Exception;
    public void addProvier (Provider provider)throws Exception;

    //delete
    public void deleteBook (long bookID) throws Exception;
    public void deleteCustomer (long customerID) throws Exception;
    public void deleteProvider(long providerID) throws Exception;

    //update
    public void updateShoppingCart () throws Exception;
    public void updateProduct (Purchase purchase) throws Exception;

   // public ArrayList<Shop> getShopByProductID (long productID) throws Exception;

}
