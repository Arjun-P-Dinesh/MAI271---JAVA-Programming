
//the order of execution is not decided by developer, its done by system scheduler
class A extends Thread{
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Christ");
        } 
    }
class B extends Thread{
    public void run(){
        for(int i = 0; i <= 10; i++){
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            
            System.out.println("University");
        }
        }
    }
public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}