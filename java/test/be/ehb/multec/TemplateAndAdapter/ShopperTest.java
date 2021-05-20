package be.ehb.multec.TemplateAndAdapter;


import org.junit.jupiter.api.Test;

public class ShopperTest {
    @Test
    public void shopper() {
        Shopper igor = new Shopper("igor","baeyens",
                "belgium", "roosdaal",100);
        igor.goShopping();
    }

    @Test
    public void windowShopper() {
        WindowShopper jorn = new WindowShopper("jorn", "baeyens",
                "belgium", "roosdaal", 15);
        jorn.goShopping();
    }

    @Test
    public void buying() {
        Shopper igor = new Shopper("igor","baeyens",
                "belgium", "roosdaal",100);
        igor.iShopper.buyItemWithOriginCurrency();
    }
}