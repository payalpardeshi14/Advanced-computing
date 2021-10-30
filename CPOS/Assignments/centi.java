import java.util.Scanner;
class centi{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    double centi,meter,kilometer;
    System.out.println("Enter the centimeter= ");
    centi=sc.nextDouble();
    meter=(centi/100);
    System.out.println("centimeter in meter ="+meter);
    kilometer=(centi/100000);
    System.out.println("centimeter in kilometer="+kilometer);
}
}