package developingcalculator2;
import developingcalculator2.GeoObject;
import developingcalculator2.Input;
//Triangle subclass of the superclass, GeometricObject
public class Triangle extends GeoObject {
    
    //Instance variables
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private boolean trueTriangle = true;
    
    //Constructor that creates a default triangle
    public Triangle() {
        
    }
    
    
    
    //Constructor that references the side length instance variables and passes 
    //in a color and whether its filled
    public Triangle(String color, boolean filled, double side1, double side2, double side3){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //Getter method for side length one that references and returns 
    //the instance variable side1
    public double getSide1(double side1){
        return this.side1 = side1;
    }
    
    //Getter method for side length two that references and returns 
    //the instance variable side2
    public double getSide2(double side2){
        return this.side2 = side2;
    }
    
    //Getter method for side length three that references and returns 
    //the instance variable side3
    public double getSide3(double side3){
        return this.side3 = side3;
    }
    
    //Getter method that caculates and returns the area using the three side 
    //lengths and Heron's formula (instead of A = (b * h) / 2
    public double getArea(){
   
        
        double s = (this.side1 + this.side2 + this.side3) / 2;
        
        double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
       
        return area;
    }
    
    //Getter method that caculates and returns the perimeter using the three side lengths
    public double getPerimeter(){
        
        double perimeter = this.side1 + this.side2 + this.side3;
        
        return perimeter;
    }
    
    //String method that returns a description of the triangle (its side lengths)
    public String toString(){
        return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
    }
    
    // **Boolean method that references the trueTriangle & side length instance 
    //variables, tests the triangle side lengthsreturns trueTriangle or 
    //false if the triangle is a real triangle or not
    public boolean testTriangle(){
       
        if (this.side1 + this.side2 <= this.side3){
            return false;
        } else
            return this.trueTriangle;

    }
    
    // **String method that returns a description of the actual type of
    //triangle (the other string method only returns the side lengths of the 
    //triangle
    public String triangleType(){
        
        if (this.side1 == this.side3 && this.side2 == this.side3) {
             return "This is an Equilateral Triangle";
        } else if (this.side1 == this.side2 && this.side1 != this.side3){
             return "This is an Isoceles Triangle";
        } else if (((this.side1 * this.side1) + (this.side2 * this.side2)) == (this.side3 * this.side3)) {
                 return "This is a Right Triangle";
        } else
             return "This is a Scalene Triangle";
           
        }
    }