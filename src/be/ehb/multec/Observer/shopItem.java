package be.ehb.multec.Observer;

public class shopItem implements IshopItem {
    private String updateString;
    public String name;
    protected int price;


    public shopItem() {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void update(){

    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public String warnObservers() {
        for(Observer observer:observers){
            updateString = observer.update();
        }
        return updateString;
    }


}
