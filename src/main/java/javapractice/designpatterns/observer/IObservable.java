package javapractice.designpatterns.observer;

import java.util.List;

/**
 * Created by priya on 2/1/2018.
 */
public interface IObservable {

    default void add(AbstractObserver observer) {
        this.getObservers().add(observer);
    }

    default void remove(AbstractObserver observer) {
        this.getObservers().remove(observer);
    }

    List<AbstractObserver> getObservers();

    default void notifyObservables(){
        getObservers().forEach(AbstractObserver::update);
    }

}
