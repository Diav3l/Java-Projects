package assignment03.problem03_04;
import java.math.BigInteger;
/**
 * 9/11/2023<p>
 * CSC 1061 - Computer Science II - Java<p>
 * Fills an arry with the summation Series of <p> 1/2 + 2/3 + 3/4 + ... + 98/99 + 99/100 <p> Then solves the Summation Series
 * @author Cole Gordnier
 */
public class SummationSeries {
    public static void main(String[] args){
        Rational[] summationSeries = new Rational[98];
        int numerator = 1;
        int denominator = 2;

        for(int i=2;i<100;i++){
            summationSeries[i-2] = new Rational(new BigInteger(String.valueOf(numerator)),new BigInteger(String.valueOf(denominator)));
            numerator++;
            denominator++;
        }

        double result = 0;
        for(Rational R: summationSeries){
            result+=R.doubleValue();
        }

        System.out.println("The solution to the summarion series is : "+result);
    }
}
