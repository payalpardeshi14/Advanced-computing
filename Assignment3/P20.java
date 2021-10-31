import java.util.*;
class P20{
  public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the decimal number=");
  int decimal;
  decimal=sc.nextInt();
  String octal=Integer.toOctalString(decimal);
  System.out.println("octal="+octal);
}
}