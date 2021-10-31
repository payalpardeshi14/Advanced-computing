import java.util.*;
  class Array1{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int sum=0,mul=1;
    int a[]=new int[5];
    System.out.println("enter the element=");
    for(int i=0;i<a.length;i++)
     {
        a[i]=sc.nextInt();
        sum=sum+a[i];
     }
    System.out.println("sum="+sum);


      System.out.println("Enter the elemen for mul=");
      for(int j=0;j<a.length;j++)
      {
        a[j]=sc.nextInt();
        mul=mul*a[j];
      }
      System.out.println("mul="+mul);
    
}
}