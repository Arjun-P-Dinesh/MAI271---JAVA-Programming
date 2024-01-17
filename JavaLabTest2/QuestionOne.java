package JavaLabTest2;

import java.util.*;

// this program contain 3 synchronized threads
// first thread prints "Welcome to Java Programming Practical Test2"
// second thread is dedicated to merging  overlapping intervals, 
//  ensuring the output contains only mutually exclusive intevals
class QuestionOne {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
    }
    class A extends Thread {
        public void run() {
            System.out.println("Welcome to Java Programming Practical Test2");
            }
        }
    }
}









