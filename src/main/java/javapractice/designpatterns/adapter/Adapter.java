package javapractice.designpatterns.adapter;

public class Adapter implements IInterface {
    @Override
    public void methodA() {
        EnhancedClassA classA=new EnhancedClassA();
        classA.enhanceMethodA();
    }
}
