import java.util.*;
class P13{
 public static void main(String []args){
 Scanner sc=new Scanner(System.in);
 int num1;
 int num2;
 System.out.println("Enter the first number=");
 num1=sc.nextInt();
 System.out.println("Enter the second number=");
 num2=sc.nextInt();
System.out.println("the number before swap= "+num1+" "+num2);
 int temp;
 temp=num1;
 num1=num2;
 num2=temp;
 System.out.println("the number after swap= "+num1+" "+num2);
}
}