package javapractice.designpatterns.Bridge;

public class ClassA extends AbstractClassA{
    ColorInterface colorInterface;

    public ClassA(ColorInterface colorInterface) {
        this.colorInterface = colorInterface;
    }

    @Override
    public void execute() {
        System.out.println("");
        System.out.println("functionality 1 ");
        colorInterface.execute();
    }
}
