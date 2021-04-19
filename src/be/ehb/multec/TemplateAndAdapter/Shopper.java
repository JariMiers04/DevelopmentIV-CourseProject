package be.ehb.multec.TemplateAndAdapter;

public class Shopper {

    IShopper iShopper = new CurrencyAdapter(new ShopCurrency());

    private String firstname;
    private String lastname;
    private String country;
    private String city;
    private int currency;

    public Shopper(String firstname, String lastname, String country, String city, int currency) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
        this.city = city;
        this.currency = currency;
    }

    void goShopping() {
        visitShop();
        browseItems();
        addItemToCart();
        removeItemFromCart();
        buyItemsWithOriginCurrency();
        leaveShop();
    }

    public void visitShop() {
        System.out.println("enter the shop");
    }

    public void browseItems() {
        System.out.println("look at items available");
    }

    public void addItemToCart() {
        System.out.println("add item to cart");
    }

    public void removeItemFromCart() {
        System.out.println("remove item from cart");
    }

    public void buyItemsWithOriginCurrency() {
        iShopper.buyItemWithOriginCurrency();
    }

    public void leaveShop() {
        System.out.println("exit the shop");
    }



}
