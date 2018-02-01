package javapractice.designpatterns.decorator;

public class BorderDecorator extends DrawingBoard{

    public BorderDecorator(DrawingBoard drawingBoard) {
     drawingBoard.add(" bordered");
     this.s=drawingBoard.getS();
    }
}
