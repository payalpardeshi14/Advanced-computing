import java.util.*;
class Swap{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num1,num2,temp;
    System.out.println("Enter the num1=");
    num1=sc.nextInt();
    System.out.println("Enter the num2=");
    num2=sc.nextInt();
    System.out.println("before swap="+num1+"  "+num2);
    temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("After swap="+num1+"  "+num2);
}
}