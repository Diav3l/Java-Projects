/*Cole Gordnier
 * 9/6/2023
 * Test code to allow user input to interface with the first part of problem 3
 */
package CompSci2.assignment02;
import java.util.Scanner;

public class Problem03Test1 {
    public static void main(String[] args){//tmp
        Problem03part1 B2S = new Problem03part1();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a binary number and display its decimal equivalent : ");
        String binaryString = in.nextLine();
        B2S.bin2Dec(binaryString);
        in.close();
    }
}
