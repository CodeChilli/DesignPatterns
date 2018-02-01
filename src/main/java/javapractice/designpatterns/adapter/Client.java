package javapractice.designpatterns.adapter;

public class Client {
    Client(IInterface iInterface){
        iInterface.methodA();
    }

    public static void main(String[] args) {
        //New AbstractClassA() or new Adapter() is usually supplied from execute factory class.
        //therefore the change is not known to client although the adapter is calling
       //unrelated class it makes it seamless for client

        Client client = new Client(new ClassA());
        Client client2 = new Client(new Adapter());

    }
}
