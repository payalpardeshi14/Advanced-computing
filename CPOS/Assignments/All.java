
import java.util.Scanner;
class All{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   int num1,num2,sum,mul,sub,div,remainder;
   System.out.println("Enter the first number=");
   num1=sc.nextInt();
   System.out.println("Enter the Second number=");
   num2=sc.nextInt();
   sum=num1+num2;
   System.out.println("addition="+sum);
   sub=num1-num2;
   System.out.println("Substraction="+sub);
   mul=num1*num2;
   System.out.println("multiplication="+mul);
   div=num1/num2;
   System.out.println("division="+div);
   remainder=num1%num2;
   System.out.println("remainder="+remainder);
}
}
