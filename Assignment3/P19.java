import java.util.*;
class P19{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the decimal number=");
   int decimal;
   decimal=sc.nextInt();
   String binary=Integer.toBinaryString(decimal);
   System.out.println("Binary="+binary);
}
}