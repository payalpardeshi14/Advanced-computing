import java.util.*;
class Yearr{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int year;
    year=sc.nextInt();
    if(((year%100!=0)&&(year%4==0))||(year%400==0))
    {
      System.out.println("the year is leep year");
    }
    else
    {
      System.out.println(" the year is not leep year");
    }
}
}