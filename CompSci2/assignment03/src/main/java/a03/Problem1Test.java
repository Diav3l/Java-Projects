/**
 * @author Cole Gordnier
 * 9/9/2023
 * CSC 1061 - Computer Science II - Java
 */ 
package a03;

import java.util.ArrayList;
import java.util.Random;

 /** Test Code for ArrayList<Number> sort and shuffle methods */
class testproblem1{
    public static void main(String[] args){
        Random R = new Random();
        ArrayList<Number> TestList = new ArrayList<Number>();

        //fills TestList with incredibly BigIntegers and BigDecimals
        while(TestList.size()<10){
            TestList.add(Math.pow(R.nextGaussian(),100 ));
        }

        System.out.println("Initial list");
        PrintTestList.Print(TestList);
        System.out.println("Shuffled list");
        SortAndShuffle.shuffle(TestList);
        PrintTestList.Print(TestList);
        System.out.println("Sorted list");
        SortAndShuffle.sort(TestList);
        PrintTestList.Print(TestList);
    }
}
/**
 * prints out all values of the ArrayList<Number>
 * @param TestList
 */
interface PrintTestList{
    static void Print(ArrayList<Number> TestList){
        for(Number N: TestList){
            System.out.printf("[%s]",N);
        }
        System.out.println();
    }
}