import java.util.*;
class P12{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   double length;
   double bredth;
   System.out.println("area and peremeter of rectangle.");
   System.out.println("Enter the length=");
   length=sc.nextDouble();
   System.out.println("Enter the bredth=");
   bredth=sc.nextDouble();
   double area;
   double pere;
   area=length*bredth;
   pere=2*(length+bredth);
   System.out.println("Area="+length+"*"+bredth+"="+area);
   System.out.println("Peremeter=2*"+length+"+"+bredth+"="+pere);
   
   
   
}
}