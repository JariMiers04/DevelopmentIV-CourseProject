package be.ehb.multec.assignment;

public class CurrencyAdapter implements IShopper {

    private ShopCurrency shopCurrency;

    public CurrencyAdapter(ShopCurrency shopCurrency) {
        this.shopCurrency = shopCurrency;
    }

    @Override
    public void buyItemWithOriginCurrency() {
        shopCurrency.buyItemWithShopCurrency();
    }
}
