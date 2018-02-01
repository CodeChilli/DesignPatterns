package javapractice.designpatterns.Bridge;

/** bridge is cartesiuan product of two sets */
public class BridgeMain {


    public static void main(String[] args) {
        new ClassA(new ColorInterface() {
        }).execute();

        new ClassA(new Brown()).execute();

        new ClassB(new ColorInterface() {
        }).execute();
        new ClassB(new Brown()).execute();

    }

}
