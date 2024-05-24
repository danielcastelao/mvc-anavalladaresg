package cod.mvc.model;

import cod.mvc.controller.Observer;

import java.util.ArrayList;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    static void notifyObservers(Coche coche) {
    }
}