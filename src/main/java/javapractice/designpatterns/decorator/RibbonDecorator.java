package javapractice.designpatterns.decorator;

public class RibbonDecorator extends DrawingBoard{

    public RibbonDecorator(DrawingBoard drawingBoard) {
     drawingBoard.add("ribbon");
     this.s=drawingBoard.getS();
    }
}
