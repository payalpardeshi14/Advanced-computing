import java.util.*;
import java.lang.Math;
class P10{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   double radius;
   double area;
   double peremeter;
   System.out.println("Enter the radius=");
   radius=sc.nextDouble();
   peremeter=(2*Math.PI*radius);
   System.out.println("circum="+peremeter);
   area=(Math.PI*(radius*radius));
   System.out.println("area= "+area);
  
}
}