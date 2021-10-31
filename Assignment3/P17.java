import java.util.*;
class P17{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the binary value=");
    String binary;
    binary=sc.nextLine();
    int decimal=Integer.parseInt(binary,2);
    String octal=Integer.toOctalString(decimal);
    System.out.println("Octal"+octal);
}
}