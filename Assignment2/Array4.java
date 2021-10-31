import java.util.*;
class Array4{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int n;
   System.out.printf("Enter the array element u have=");
   n=sc.nextInt();
    System.out.printf("Enter the array element");
   int a[]=new int[n];
   for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
   }
    for(int j=0;j<a.length;j++){
    System.out.println(" "+a[j]);
   }
   Arrays.sort(a);
   for(int k=0;k<a.length;k++){
    System.out.print(" "+a[k]);
   }
}
}