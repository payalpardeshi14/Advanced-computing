import java.util.Scanner;
class Natu{
     public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int i,n,sum=0;
     n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
        sum=sum+i;
     }
     System.out.println("sum of natural no="+sum);
}
}