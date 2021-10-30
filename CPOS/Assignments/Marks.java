import java.util.Scanner;
class Marks{
     public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int num;
     System.out.printf("Enter the number=");
     num=sc.nextInt();
     if((num>=0)&&(num<=25))
     {
       System.out.printf("the candidade is fail 'F'");
     }
     else if((num>=25)&&(num<=45))
     {
       System.out.printf("the candidade is grade 'E'");
     }
      else if((num>=45)&&(num<=50))
     {
       System.out.printf("the candidade is grade 'D'");
     }
      else if((num>=50)&&(num<=60))
     {
       System.out.printf("the candidade is grade 'C'");
     }
      else if((num>=60)&&(num<=80))
     {
       System.out.printf("the candidade is grade 'B'");
     }
     else
     {
       System.out.printf("the candidade is grade 'A'");
     }
}
}