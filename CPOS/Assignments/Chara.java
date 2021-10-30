import java.util.*;
class Chara{
public static void main(String []args){
Scanner sc =new Scanner(System.in);

System.out.println("Take the Character :");
char N =sc.next().charAt(0);
int n =N;

if(N>=65 && N<=90){
System.out.println("Given Character is upper letter:"+N);
}
else if(N>=97 && N<=122){
System.out.println("Given Character is lower letter:"+N);
  }
else{
System.out.println("Given input is digit :"+N);
}
 }
}

