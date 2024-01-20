package JavaLabTest2;

import java.util.*;

// this program contain 3 synchronized threads
// first thread prints "Welcome to Java Programming Practical Test2"
// second thread is dedicated to merging overlapping intervals, 
//  ensuring the output contains only mutually exclusive intevals
// third class determines whether the given strings are anagrams
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
    class B extends Thread {
        public void run() {
            int[] intervals = {1, 3, 2, 4, 6, 8, 9, 10}
            int[] mergedIntervals = MergeOverlappingIntervals.mergeOverlappingIntervals(intervals);
            System.out.println("Merged Intervals: " + Arrays.toString(mergedIntervals));
        }
    }
    class C extends Thread {
        public void run() {
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter String one");
            String str1 = myObj.nextLine();
            System.out.println("Enter String two");
            String str2 = myObj.nextLine();
            boolean result = Anagram.areAnagrams(str1, str2);
            System.out.println("The strings are " + (result ? "anagrams" : "not anagrams"));
        }
    }
    //MergeOverlappingIntervals - merging  overlapping intervals
    public class MergeOverlappingIntervals {
        public static int[] mergeOverlappingIntervals(int[] intervals) {

    }
    }
    public class Anagram {

    }
}








