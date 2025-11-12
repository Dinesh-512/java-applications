/*create a java app where we have two interface having one abstract and defined in each ,an abstract class which contains an abstract method and a parameterized constructor then inherit all these in a concrete class and provide functionality for them and invoke under main of separate class by providing D.i*/
import java.util.*;
interface A
{
 Scanner sc=new Scanner(System.in);

 int M1(float a);
 default String M2(int a)
 {
  System.out.println(a);
  return sc.next();

 }

}
interface B
{
    char M3(int a);
  default long M4(short a )
  {
   System.out.println(a);
   return A.sc.nextLong();
 }

} 
abstract class c
{
 abstract float M5(short a);
 c(int a)
 {
  System.out.println(a);

 }
}
class D extends c implements A,B
{
 

  public int M1(float a)
  {
   System.out.println(a);
   return A.sc.nextInt();
 } 
 public char M3(int a)
 {
  System.out.println(a);
   return A.sc.next().charAt(0);
 }
 public float M5(short a)
 {
  System.out.println(a);
   return A.sc.nextFloat();

 }
 D()
 {
  super(A.sc.nextInt());

 }
}

class test
{
 public static void main(String[]args)
{
 D x=new D();
 System.out.println(x.M1(A.sc.nextFloat()));
 System.out.println(x.M3(A.sc.nextInt()));
 System.out.println(x.M5(A.sc.nextShort()));
 System.out.println(x.M2(A.sc.nextInt()));
 System.out.println(x.M4(A.sc.nextShort()));
 


}


}