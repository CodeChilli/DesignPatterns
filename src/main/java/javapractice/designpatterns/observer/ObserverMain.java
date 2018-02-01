package javapractice.designpatterns.observer;

/**
 * Created by priya on 2/1/2018.
 */
public class ObserverMain {
    public static void main(String args[]){
        ConcreteObservable concreteObservable=new ConcreteObservable();
        Observer1 observer1 = new Observer1(concreteObservable);
        Observer2 observer2 = new Observer2(concreteObservable);
        concreteObservable.add(observer1);
        concreteObservable.add(observer2);
        concreteObservable.update(700);
        //Expect two times printing on the console = Pass

    }
}
