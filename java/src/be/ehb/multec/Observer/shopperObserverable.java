package be.ehb.multec.Observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class shopperObserverable implements Observer{
    private int observerCount;

    public shopperObserverable(int observerCount) {
        this.observerCount = observerCount;
    }

    @Override
    public String update() {
        System.out.println("shopperObserverable counter: "+ observerCount + "updated");
        return "shopperObserverable updated!";
    }
}
