import java.util.*;
   class P22{
     public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the octal number=");
     String octal;
     octal=sc.nextLine();
     int decimal=Integer.parseInt(octal,8);
     String hexa=Integer.toHexString(decimal);
     System.out.println("hexadecimal="+hexa);

}
}