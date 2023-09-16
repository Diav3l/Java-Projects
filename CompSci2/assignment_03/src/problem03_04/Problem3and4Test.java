package problem03_04;
import java.util.Scanner;
import java.math.BigInteger;

/**
 * 9/11/2023<p>
 * CSC 1061 - Computer Science II - Java<p>
 * User input to test the Rational class<p>
 * @author Cole Gordnier
 */ 
public class Problem3and4Test {
    public static void main(String[] args){
        
        /** Maps user input to String[] and splits the line into 2 segments */
        System.out.print("Enter the first rational number : ");
        Scanner in = new Scanner(System.in);
        String Rational1[] = in.nextLine().split(" ",2);
        System.out.print("Enter the second rational number : ");
        String Rational2[] = in.nextLine().split(" ",2);
        in.close();

        /**Casts the user input String[] into BigIntegers */
        BigInteger Numorator1 = new BigInteger(String.valueOf(Rational1[0]));
        BigInteger Denominator1 = new BigInteger(String.valueOf(Rational1[1]));
        BigInteger Numorator2 = new BigInteger(String.valueOf(Rational2[0]));
        BigInteger Denominator2 = new BigInteger(String.valueOf(Rational2[1]));

        /**Creates Rationals with the BigIntegers */
        Rational R1 = new Rational(Numorator1,Denominator1);
        Rational R2 = new Rational(Numorator2,Denominator2);

        /**Tests the methods of the Rational class */
        System.out.println(R1+" + "+R2+" = "+R1.add(R2));
        System.out.println(R1+" - "+R2+" = "+R1.subtract(R2));
        System.out.println(R1+" * "+R2+" = "+R1.multiply(R2));
        System.out.println(R1+" / "+R2+" = "+R1.divide(R2));
        System.out.println(R2+" is "+R2.doubleValue());
    }
}