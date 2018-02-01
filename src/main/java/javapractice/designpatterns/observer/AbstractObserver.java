package javapractice.designpatterns.observer;

public abstract class AbstractObserver implements IObserver{
    private final ConcreteObservable concreteObserver;

    public AbstractObserver(ConcreteObservable concreteObservable) {
        this.concreteObserver = concreteObservable;
    }

    @Override
    public ConcreteObservable getObserver() {
        return concreteObserver;
    }
}