package javapractice.designpatterns.Bridge;

public interface ColorInterface {
 public default void execute(){
     System.out.println("red color applied ");
 }
}
