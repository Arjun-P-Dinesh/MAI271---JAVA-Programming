import java.util.Arrays;
import java.util.Vector;


class Test12{
    public static void main(String[] args){
        // Vector<Integer> v=new Vector(100,5);
        // System.out.println("intial capacity = " +v.capacity());
        // System.out.println("initial Size = "+v.size());
        // for(int i=0;i<=100;i++){
        //     v.add(i);
        // }
        // System.out.println(v);
        // System.out.println("Capacity = "+v.capacity());
        // System.out.println("Size = "+v.size());

        Object[] obj = new Object[]{"Rithul","Tanila","Tamira"};
        Vector v = new Vector<>(Arrays.asList(obj));
        System.out.println(v);
        System.out.println("Capacity = "+v.capacity());
        v.add("Reeeveee");
        System.out.println("Capacity = "+v.capacity());
        // Vector<String> v1 = new Vector<>();
        // Vector<String> v2 = new Vector<>();
        // for(int i=0;i<5;i++){
        //     v1.add("Christ"+i);
        // }
        // for(int j=0;j<v1.size();j++){
        //     v2.add(v1.get(j));
        // }
        // System.out.println("Vector 1 ="+v1);
        // System.out.println("Vector 2 ="+v2);
        // System.out.println(v1.containsAll(v2));
        // v1.add(1,"MIT");
        // v1.add(2,"MIT");
        // System.out.println(v1.containsAll(v2));
    }


}
