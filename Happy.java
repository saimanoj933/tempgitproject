import java.util.Scanner;
class Happy
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int p = sc.nextInt();
boolean rs = getHappy(p);
if(rs==true)
System.out.println("The number is a Happy number");
else
System.out.println("The number is not a Happy number");
}
static boolean getHappy(int n)
{
while(n<9)
{
int sum = 0;
do{
int r = n%10;
sum = sum+r;
n =n/10;
}while(n!=0);
n = sum;
}
return n==1||n==7;
}
}


