import java.util.*;
class P18{
       public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the binary number =");
       String binary;
       binary=sc.nextLine();
       int decimal=Integer.parseInt(binary,2);
       String hexa=Integer.toHexString(decimal);
       System.out.println("Hexadecimal="+hexa); 
        
}
}