import java.util.*;
class P16{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the the binary digit=");
  String binary;
  binary=sc.nextLine();
  int decimal=Integer.parseInt(binary,2);
  System.out.println("Decimal="+decimal);
}
}