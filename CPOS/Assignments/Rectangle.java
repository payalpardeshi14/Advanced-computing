import java.util.Scanner;
class Rect{
     public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int length;
     int breadth;
     int perimiter;
     System.out.println("enter the value of length=");
     int lenghth=sc.nextInt();
     System.out.println("enter the value of breadth=");
     int breadth=sc.nextInt();
     perimiter=(2*(length+breadth));
     System.out.println("the perimiter of rectangle="+perimiter);
}
}
