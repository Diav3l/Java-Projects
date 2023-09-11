package CompSci2.assignment01;
class test1{
  public static void main(String[] args){
    System.out.println("****Problem 1****");
    Rectangle r1 = new Rectangle(4,40);
    Rectangle r2 = new Rectangle(3.5,35.9);

    System.out.println("**Rectangle 1**");
    r1.printAll();
    System.out.println("**Rectangle 2**");
    r2.printAll();
  }
}


// Define the rectangle class with two constructors
class Rectangle {
  double width,height;

  Rectangle(){
    width = 1;
    height = 1;
  }


  Rectangle(double newWidth, double newHeight){
    width = newWidth;
    height = newHeight;
  }


  double getArea(){
    return(width * height);
  }


  double getPerimeter(){
    return((width*2)+(height*2));
  }


  void printAll(){
    System.out.println("Width = " + width + "\nHeight = " + height + "\nArea = " + getArea() + "\nPerimeter = " + getPerimeter());
  }

  
}