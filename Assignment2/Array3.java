import java.util.*;
class Array3{
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
     System.out.println(" "+a[j]);
    }
    int m;
    System.out.println("Enter the value check= ");
    m=sc.nextInt();
    for(int k=0;k<a.length;k++){
    if(m==a[k])
     {
       System.out.println("Enter the number is same"+a[k]);
     }
    else{
     System.out.println("Enter the number is not same"+a[k]);
    }
    }
    
}
}