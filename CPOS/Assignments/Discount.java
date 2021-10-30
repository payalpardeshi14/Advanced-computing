import java.util.Scanner;
class Discount{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int amount=0 ,discount=0 ;

System.out.println("Enter quantity/s: ");	
int quantity = sc.nextInt();
													
if( quantity >= 10 )
{
amount = 100*quantity;
discount = (amount - (amount / 10));
System.out.println("Discounted price : " + discount);
}
							
else{
System.out.println("Amount is: " + amount);
}

}
}
