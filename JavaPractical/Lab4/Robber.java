package JavaPractical.Lab4;

import java.util.*;

//creating abstract class named Robber
public abstract class Robber{
    public void RobbingClass() {
        System.out.println("MScAI&ML");
    }
    public void MachineLearning() {
        System.out.println("I love MachineLearning.");
    }
}
class JAVAProfessionalRobber extends Robber{

}
class Main{
    public static void main(String[] args) {
    JAVAProfessionalRobber Robber = new JAVAProfessionalRobber();
    Robber.RobbingClass();
    Robber.MachineLearning();
    }
}
