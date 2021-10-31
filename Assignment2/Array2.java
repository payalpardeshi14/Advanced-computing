import java.util.*;
class Array2{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   int num;
   System.out.println("Enter the value for 1.Integer 2.float ");
   num=sc.nextInt();
   if(num==1){
    int n;
    System.out.println("Enter the number of integer elemnt=");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the element=");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int j=0;j<a.length;j++)
    {
      System.out.println(" "+a[j]);
    }
   }else if(num==2){
   int m;
   System.out.println("Enter the number of float element=");
   m=sc.nextInt();
   float a[]=new float[m];
   System.out.println("Enter the element=");
   for(int k=0;k<a.length;k++)
   {
     a[k]=sc.nextFloat();
   }
   
   for(int l=0;l<a.length;l++)
   {
     System.out.println(" "+a[l]);
   }
   
  }else{
   System.out.println(" value is wrong pls check ones angain");
  }
}
}