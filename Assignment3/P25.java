class P25{
public static void main(String args[])
{
for(int i=1;i<=15;i++)
{
if(i<10) 
{
if(i%2==1)
{
for(int j=1;j<7;j++)
{
System.out.print("* ");
}
}
else
{
System.out.print(" ");
for(int j=1;j<6;j++)
{
System.out.print("* ");
}
System.out.print(" ");
}
for(int j=1;j<35;j++)
{
System.out.print("=");
}
}
else
{
for(int j=1;j<47;j++)
{
	
System.out.print("=");
}

}
System.out.println();
}

}
}