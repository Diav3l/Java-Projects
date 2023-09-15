/*Cole Gordnier
 * 9/6/2023
 * Randomly generates 2 numbers and quizes the user on the answer.
 * Prints out if and the number of times an answer was given
 */
package assignment02;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class RepeatAdditionQuiz {
    static ArrayList<Long> answers = new ArrayList<Long>();
    public static void main(String[] args) {
        Random random = new Random();
        

        int number1 = random.nextInt() * 10;
        int number2 = random.nextInt() * 10;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        long answer = input.nextLong(); // I changed this to a long because some of the answers are out of bounds for an int and throw an error
        //ArrayList also doesnt support primitive data types such as int so this needed to be changed or casted anyways
        while (number1 + number2 != answer) {
        testForDuplicates(answer);
        System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
        answer = input.nextInt();
        
        }

        input.close();

        System.out.println("You got it!");
  }




    static void testForDuplicates(long answer){
        answers.add(answer);
        int i=-1;
        for(long a : answers){
            if(answer == a)
                i++;
        }
        if(i>0)
            System.out.println(answer+" was already entered "+i+" times");
    }
}
