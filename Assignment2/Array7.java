import java.util.*;
class Array7{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int n;
   System.out.println("Enter the array size=");
   n=sc.nextInt();
   System.out.println("Enter the array element=");
   int a[]=new int[n];
   for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
    }
   for(int j=0;j<a.length;j++){
    System.out.print(" "+a[j]);
   }
    Arrays.sort(a);
   System.out.println("Sorted array is=");
   for(int k=0;k<a.length;k++){
    System.out.print(" "+a[k]);
   }
   System.out.print("the smallest number is "+a[0]);
   System.out.print("the gretest number is "+a[n-1]);
}
}