package javapractice.designpatterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();
        drawingBoard = new BorderDecorator(drawingBoard);
        drawingBoard = new RibbonDecorator(drawingBoard);
        System.out.println(drawingBoard.getS());
    }
}
