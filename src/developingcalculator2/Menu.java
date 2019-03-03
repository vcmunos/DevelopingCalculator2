package developingcalculator2;
import developingcalculator2.Input;
import developingcalculator2.Triangle;
import developingcalculator2.GeoObject;
import java.util.*;



        
public class Menu{
public static void main(String[] args) {
    int num;
    do {
        do {
        System.out.print("Welcome! This program helps simplify calculations "
                + "by taking in measurements and doing the hard part for you.\n \n");
        System.out.print("Please choose the type of calculation you "
                + "need computed by typing in the corresponding number: \n \t");
        System.out.print("1. Triangle Type \n \t");
        
        num = Input.keyboard.nextInt();
        
       
      if (num == 1){
        String color = Input.keyboard.nextLine();
        boolean isFilled = Input.keyboard.nextBoolean();
        double side1 = Input.keyboard.nextDouble();
        double side2 = Input.keyboard.nextDouble();
        double side3 = Input.keyboard.nextDouble();     
     
     Triangle triangle = new Triangle(color, isFilled, side1, side2, side3);
        
     
     
     System.out.println(triangle);
    
    
    System.out.println("Is this a real triangle?: " + triangle.testTriangle());
    
    if (triangle.testTriangle()){
    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is "
      + triangle.getPerimeter()); 
    System.out.println(triangle.triangleType());
    }
    }else {
          System.out.print("Please Try Again! \n \n");
      }  
     }while (num == 1);
    }while (num != 0);
  }
}