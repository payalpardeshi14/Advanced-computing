import java.util.Scanner;
class Avg{
    public static void main(String[]avgs){
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3;
    double average; 
    System.out.println("Enter the first no=");
    num1=sc.nextInt();
    System.out.println("Enter the second no=");
    num2=sc.nextInt();
    System.out.println("Enter the third no=");
    num3=sc.nextInt();
    average=(num1+num2+num3)/3;
    System.out.println("Average="+average);
}
}
