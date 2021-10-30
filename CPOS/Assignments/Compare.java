import java.util.Scanner;
 class Compare{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    System.out.println("Enter the num1=");
    num1=sc.nextInt();
    System.out.println("Enter the num2=");
    num2=sc.nextInt();
    if(num1>num2)
     {
       System.out.println("num1 is grater than num2");
     }
    else if(num2>num1)
     {
       System.out.println("num2 is grater than num1");
     }
    else
     {
      System.out.println("both are same");
     }
    
}
}