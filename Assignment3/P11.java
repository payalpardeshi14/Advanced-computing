import java.util.*;
class P11{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    System.out.println("Enter the num1=");
    num1=sc.nextInt();
    System.out.println("Enter the num2=");
    num2=sc.nextInt();
    System.out.println("Enter the num3=");
    num3=sc.nextInt();
    double avg;
    avg=(num1+num2+num3)/3;
    System.out.println("The average of number="+avg);
}
}