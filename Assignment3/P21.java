import java.util.*;
class P21{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the decimal number=");
    int decimal;
    decimal=sc.nextInt();
    String Hexa=Integer.toHexString(decimal);
    System.out.println("Hexadecimal number="+Hexa);
}
}