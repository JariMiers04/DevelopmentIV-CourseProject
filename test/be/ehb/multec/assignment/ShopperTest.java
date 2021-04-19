package be.ehb.multec.assignment;

import org.junit.jupiter.api.Test;

class ShopperTest {

    @Test
    void shopper() {
        Shopper igor = new Shopper("igor","baeyens",
                "belgium", "roosdaal",100);
        igor.goShopping();
    }

    @Test
    void windowShopper() {
        WindowShopper jorn = new WindowShopper("jorn", "baeyens",
                "belgium", "roosdaal", 15);
        jorn.goShopping();
    }

    @Test
    void observer() {
        IShoptItem cookies = new ShopItem("cookies",10);
        IShoptItem candy = new ShopItem("candy", 5);
        Shopper igor = new Shopper("igor", "baeyens",
                "belgium", "roosdaal", 15);
        igor.addItem(cookies);
        igor.addItem(candy);
        igor.goShopping();
    }
}