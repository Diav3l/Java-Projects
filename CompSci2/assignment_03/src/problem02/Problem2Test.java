/**
 * @author Cole Gordnier
 * 9/10/2023
 * CSC 1061 - Computer Science II - Java
 */ 
package problem02;

import java.util.Random;


/** Test Code GeometricObjects max() and compareTo() methods */
public class Problem2Test {
    public static void main(String[] args){
        Random R = new Random();
        Circle c1 = new Circle(R.nextDouble(51), "White", false);
        Circle c2 = new Circle(R.nextDouble(51), "Red", true);

        System.out.println("The larger of the two circles is the color : "+GeometricObject.max(c1,c2).getColor());//Prints the color of the larger of 2 circles

        Rectangle r1 = new Rectangle(R.nextDouble(51),R.nextDouble(51), "Green", false);
        Rectangle r2 = new Rectangle(R.nextDouble(51),R.nextDouble(51), "Blue", true);

        System.out.println("The larger of the two rectangles is the color : "+GeometricObject.max(r1,r2).getColor());//Prints the color of the larger of 2 rectangles
    }
    
}
