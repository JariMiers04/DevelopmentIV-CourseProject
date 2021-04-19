package be.ehb.multec.assignment;

public class ShopItem implements IShoptItem {

    private String name;
    private int price;

    public ShopItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void update() {
        System.out.println("The item " + name + " has been bought for " + price + " shopcurrency");
    }

}
