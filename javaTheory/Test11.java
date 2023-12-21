import java.util.*;
class Test11 {
    final String[] buffer = new String[5];
    int count = 0;
    public static void main(String[] args) {
        Test11 obj = new Test11();
        Producer pos = obj.new Producer();
        Consumer con = obj.new Consumer();
        pos.start();
        con.start();
    }
    class Producer extends Thread {
        public void run() {
            while (true) {
                procedData();
            }
        }
    }
    class Consumer extends Thread {
        public void run() {
            while (true) {
                consumeData();
            }
        }
    }
    public void procedData() {
        synchronized (buffer) {
            if (count == buffer.length) {
                try {
                    System.out.println("Buffer is full");
                    buffer.wait();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Data to buffer");
            String data = s.next();
            if("exit".equalsIgnoreCase(data)){
                System.exit(0);
            }
            buffer[count++]=data;
            System.out.println("Produced data:"+data);
            buffer.notifyAll();
        }
    }
    public void consumeData() {
        synchronized (buffer) {
            if (count == 0) {
                try {
                    System.out.println("Buffer is empty");
                    buffer.wait();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            System.out.println("Consumed data:"+buffer[--count]);
            System.out.println("Remaining data in buffer:"+count);
            buffer.notifyAll();
        }
    }
}

//Assignment >>>
//want to inform consumer the moment the data is inserted by the producer.
//want to inform the producer the moment the data is retrived by the consumer.
//use "context switch" in OS concept