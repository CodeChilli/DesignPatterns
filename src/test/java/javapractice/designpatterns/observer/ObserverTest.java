package javapractice.designpatterns.observer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObserverTest {

    @Test
    public void observers() {
        ConcreteObservable concreteObservable = new ConcreteObservable();
        Observer1 observer = new Observer1(concreteObservable);
        concreteObservable.add(observer);
        //assertEquals(concreteObservable.update(8),"Received Update, current value is:8");

    }

}
