import java.util.*;
import java.lang.Math;
class Circle{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   double radius;
   double diameter;
   double area;
   double circum;
   System.out.println("Enter the radius=");
   radius=sc.nextDouble();
   diameter=(2*radius);
   System.out.println("Diameter ="+diameter);
   circum=(2*Math.PI*radius);
   System.out.println("circum="+circum);
   area=(Math.PI*(radius*radius));
   System.out.println("area= "+area);
  
}
}