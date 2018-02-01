package javapractice.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements IObservable{
    private List<AbstractObserver> observers = new ArrayList<AbstractObserver>();

    private int someNumber = 0;

    void update(int someNumber) {
        this.someNumber = someNumber;
        this.notifyObservables();
    }

    public int getSomeNumber() {
        return someNumber;
    }

    @Override
    public List<AbstractObserver> getObservers() {
        return observers;
    }


}