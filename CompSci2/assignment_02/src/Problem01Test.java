/*Cole Gordnier
 * 9/6/2023
 * Test code for Triangle object uses user input
 */
import java.util.Scanner;

class userInput{
  public static void main(String[] args){
    double s1,s2,s3;
    String color;
    boolean filled = true;

    System.out.println("Enter three sides of a triangle, its color, and if the shape is filled.");
    Scanner in = new Scanner(System.in);
    System.out.print("Side one : ");
    s1 = in.nextDouble();
    System.out.print("Side two : ");
    s2 = in.nextDouble();
    System.out.print("Side three : ");
    s3 = in.nextDouble();

    System.out.print("Color : ");
    in.nextLine();
    color = in.nextLine();
    System.out.print("Filled? (true,yes/false,no): ");
    switch(in.nextLine().toUpperCase()){
      case "YES":
        filled = true;
        break;
      case "TRUE":
        filled = true;
        break;
      case "NO":
        filled = false;
        break;
      case "FALSE":
        filled = false;
        break;
    }
    in.close();
    Triangle T = new Triangle(s1, s2, s3, color, filled);
    System.out.println(T.toString());
    System.out.println("area : "+T.getArea()+"\nPerimeter"+T.getPerimeter()+"\nColor : "+T.getColor()+"\nIs Filled : "+T.isFilled());
  }
}