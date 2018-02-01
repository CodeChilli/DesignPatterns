package javapractice.designpatterns.adapter;

/**
 * Created by priya on 2/1/2018.
 */
public class EnhancedClassA implements SomeOtherInterface{
    @Override
    public void enhanceMethodA() {
        System.out.println("Enhanced method A");
    }
}
