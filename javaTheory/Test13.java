import java.util.Vector;

public class Test13 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        Thread t1 = new Thread(()->
        {
            for(int i=0;i<5;i++){
                vector.add("Christ"+i);
            }
        });
        Thread t2 = new Thread(()->
        {
            for(int i=0;i<10;i++){
                vector.add("mit"+i);
            }
        }
    );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(vector);
}
}