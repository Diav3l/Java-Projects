/*Cole Gordnier
 * 9/6/2023
 * Triangle element for geometricObject
 */
package assignment02;
class Triangle extends GeometricObject{
    private double side1,side2,side3;
    Triangle(){
        side1=1;
        side2=1;
        side3=1;
        super.setFilled(true);
    }


    Triangle(double s1, double s2, double s3, String color, boolean filled){
        side1 = s1;
        side2 = s2;
        side3 = s3;
        super.setColor(color);
        super.setFilled(filled);
  
    }


    public double getSide1(){
        return side1;
    }


    public double getSide2(){
        return side2;
    }


    public double getSide3(){
        return side3;
    }


    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        return (Math.sqrt( s*(s - side1)*(s - side2)*(s - side3) ));
    }


    public double getPerimeter(){
        return(side1+side2+side3);
    }


    public String toString(){
        return("\nTriangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3);
    }
}

class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /**
   * Construct a geometric object with the specified color
   * and filled value
   */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Return filled. Since filled is boolean,
   * its get method is named isFilled
   */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  /** Return a string representation of this object */
  public String toString() {
    return ("[created: " + dateCreated + "] [color: " + color + "] [filled: " + filled + "]");
  }
}