interface Inf1{
    default void show()
    {
        System.out.println("Interface1");
    }}
interface Inf2{
    default void show()
    {
        System.out.println("Interface2");
    }}
class Test implements Inf1,Inf2{
    public void show()
    {
        Inf1.super.show();
        Inf2.super.show();
    }
    public static void main(String[] args) {
        Test5 obj=new Test5();
        obj.show();
    }
}