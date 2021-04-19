package be.ehb.multec.Observer;

import java.util.HashSet;
import java.util.Set;

public interface IshopItem {
    Set<Observer> observers = new HashSet<>();

    void addObserver(Observer observer);
    String warnObservers();

    String getName();
    int getPrice();
}
