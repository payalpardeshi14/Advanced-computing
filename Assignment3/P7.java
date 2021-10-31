import java.util.*;
class P7{
   public static void main(String[]args){

   Scanner sc=new Scanner(System.in);
   int num;
   int mul;
   System.out.println("Enter the number=");
   num=sc.nextInt();
   for(int i=1;i<=10;i++){
    mul=num*i;
    System.out.println(""+num+"*"+i+"="+mul);
   }  
}
}