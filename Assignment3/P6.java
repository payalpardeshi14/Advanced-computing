import java.util.*;
class P6{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int num1;
   System.out.println("Enter the num1=");
   num1=sc.nextInt();
   int num2;
   System.out.println("Enter the num2=");
   num2=sc.nextInt();
   int mul,div,mod,sum,sub;
   sum=num1+num2;
   sub=num1-num2;
   mul=num1*num2;
   div=num1/num2;
   mod=num1%num2;
   System.out.println(""+num1+"+"+num2+"="+sum);
   System.out.println(""+num1+"-"+num2+"="+sub);
   System.out.println(""+num1+"*"+num2+"="+mul);
   System.out.println(""+num1+"/"+num2+"="+div);
   System.out.println(""+num1+"%"+num2+"="+mod);
   
}
}