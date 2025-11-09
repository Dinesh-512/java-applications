import java.util.*;
class A
{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
float M1(int a)
{
System.out.print(a);
return sc.nextFloat();
}
A()
{
 System.out.println("this is default");
}
public static void main(String[]args)
{
 A x=new A();
 System.out.print(x.a);
 System.out.print(x.M1(sc.nextInt()));
 
}
}
