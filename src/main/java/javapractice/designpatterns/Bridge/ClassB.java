package javapractice.designpatterns.Bridge;

public class ClassB extends AbstractClassA{
    ColorInterface colorInterface;

    public ClassB(ColorInterface colorInterface) {
        this.colorInterface = colorInterface;
    }

    @Override
    public void execute() {
        System.out.println("");
        System.out.println("functionality 2 ");
        colorInterface.execute();
    }
}
