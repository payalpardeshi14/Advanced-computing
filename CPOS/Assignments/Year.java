import java.util.Scanner;
class Year{
      public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int year;
      if((year%400==0)||(year%100!=0&&year%4==0))
      {
        System.out.println("the year is leep year");
      }
      else
      {
        System.out.println("the year is not leep");
      }
}
}