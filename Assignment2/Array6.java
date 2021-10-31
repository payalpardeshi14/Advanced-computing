import java.util.*;
class Array6{
  public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("Enter the array size of first array=");
  n=sc.nextInt();
  System.out.println("Enter the array element=");
  int a[]=new int[n];
  for(int i=0;i<a.length;i++){
   a[i]=sc.nextInt();
  }
   for(int j=0;j<a.length;j++){
   System.out.print(" "+a[j]);
  }
 int m;
 System.out.println("\n Enter the array size of second array=");
 m=sc.nextInt();
 System.out.println("Enter the array element");
 int b[]=new int[m];
 for(int p=0;p<b.length;p++){
   b[p]=sc.nextInt();
 }
 for(int q=0;q<b.length;q++){
    System.out.println(" "+a[q]);
 }
  System.out.println("\n sum of element");
 int c[]=new int[m];
 for(int k=0;k<c.length;k++){
   c[k]=a[k]+b[k];
 }
 for(int l=0;l<c.length;l++){
    System.out.println(" "+c[l]);
 }
  
}
}