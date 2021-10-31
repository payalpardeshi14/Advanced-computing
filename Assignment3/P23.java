import java.util.*;
class P23{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the binary 1 value=");
   String d1=sc.nextLine();
   System.out.println("Enter the binary 2 value=");
   String d2=sc.nextLine();
   int b1=Integer.parseInt(d1,2);
   int b2=Integer.parseInt(d2,2);
   int b3=b1+b2;
   String b4=Integer.toBinaryString(b3);
   System.out.println("the sum of two binary num ="+b4);
}
}