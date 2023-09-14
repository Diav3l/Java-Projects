/**
 * @author Cole Gordnier
 * 9/9/2023
 * CSC 1061 - Computer Science II - Java
 */ 
package assignment03.Problem01;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


 /** interface for sort and shuffle methods for an ArrayList<Number>*/
public interface SortAndShuffle{

    /**
     * Shuffles ArayList<Number>
     * @param list
     */
    public static void shuffle(ArrayList<Number> list){
        Collections.shuffle(list);
    }

    /**
     * There are a number of ways to sort an ArrayList<Number>
       First thing to note is that the class Number does not have a comparator
       There are two ways (that I currently know of) to fix this issue.<p> 
     * 1) is the following line of code
       list.sort(Comparator.comparing(comp -> new BigDecimal(String.valueOf(comp))));
       Code from https://stackoverflow.com/questions/77073987/how-to-sort-an-arraylist-of-type-number
       This defines a comparator within the sort.<p>
     */ 
     //2) is the method that I implemented here, where I defined a comparitor then referenced it within the sort method.
    public static void sort(ArrayList<Number> list){
        Collections.sort(list, NumberComparator);
    }

    /**
     * Custom comparitor for the Number superclass
     * @author Cole Gordnier
     * @apiNote I am the one who made the stack overflow question. The Code posted was posted by me. I did not copy it. 
                As evidence for this my github https://github.com/Diav3l/ shares a similar name to my stack overflow account.
     */
    static Comparator<Number> NumberComparator = new Comparator<Number>(){

        public int compare(Number n1, Number n2) {
            /*
            * Number is not comparable, but, a comparator for a subclass of Number can be used to compare Numbers
            * BigDecimal is the best datatype to use for this seeing as it can cover any size number and any decimal length provided.
            */
            BigDecimal N1,N2;
            N1 = new BigDecimal(String.valueOf(n1));
            N2 = new BigDecimal(String.valueOf(n2));
            return N1.compareTo(N2);
        } 
    };
}