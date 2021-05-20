package be.ehb.multec.TemplateAndAdapter;

public class ShopCurrency {

    int currency;

    public void buyItemWithShopCurrency() {
        System.out.println("checkout and buy added items with " + currency * 1.20 + " shop currency");
    }

}
