package be.ehb.multec.assignment;

import java.util.ArrayList;
import java.util.List;

public class Shopper {

    IShopper iShopper = new CurrencyAdapter(new ShopCurrency());

    private String firstname;
    private String lastname;
    private String country;
    private String city;
    protected static int currency;
    private final List<IShoptItem> cart;

    public Shopper(String firstname, String lastname, String country, String city, int originCurrency) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
        this.city = city;
        Shopper.currency = originCurrency;
        cart = new ArrayList<>();
    }

    void goShopping() {
        visitShop();
        browseItems();


        buyItemsWithOriginCurrency();
        leaveShop();
    }

    public void visitShop() {
        System.out.println("enter the shop");
    }

    public void browseItems() {
        System.out.println("look at items available");
    }

    public void addItem(IShoptItem IShoptItem) {
        cart.add(IShoptItem);
        System.out.println("item has been added to cart");
    }

    public void removeItem(IShoptItem IShoptItem) {
        cart.remove(IShoptItem);
        System.out.println("item has been removed from cart");
    }

    public void buyItemsWithOriginCurrency() {
        iShopper.buyItemWithOriginCurrency();
        for (IShoptItem IShoptItem : cart) {
            IShoptItem.update();
        }
    }

    public void leaveShop() {
        System.out.println("exit the shop");
    }



}
