import java.util.*;
  class Array{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int a[]=new int[5];
    System.out.println("enter the element=");
    for(int i=0;i<a.length;i++)
     {
        a[i]=sc.nextInt();
        sum=sum+a[i];
     }
    System.out.println("sum="+sum);
    
}
}