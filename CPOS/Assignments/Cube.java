import java.util.Scanner;
class Cube{
     public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int i,n,cube;
     n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
        cube=i*i*i;
        System.out.println("cube="+cube);
}
     }
     
}