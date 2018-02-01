package javapractice.designpatterns.decorator;

public class DrawingBoard  {
     protected String s = new String("Drawing Board");

    public void add(String append) {
        this.s=this.s+" "+append;
    }

    public String getS() {
        return s;
    }
}
