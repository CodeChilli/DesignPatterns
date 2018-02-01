package javapractice.designpatterns.observer;

/**
 * Created by priya on 2/1/2018.
 */
public interface IObserver {
    public default void update() {
        System.out.println("Received Update, current value is:"
                + getObserver().getSomeNumber());
    }

    ConcreteObservable getObserver();
}
