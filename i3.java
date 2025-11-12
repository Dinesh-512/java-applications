/*create a java app where we have a interface it contains one abstract and one defined method then inherit this interface which contain one abstractand one defined methods then provide functionality for this in a concrete class and invoke then providing by D.I*/
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
interface B extends A
{
  char M3(int a);
  default long M4(short a )
  {
   System.out.println(a);
   return sc.nextLong();
 }
}
class C implements B
{
  public int M1(float a)
  {
   System.out.println(a);
  return sc.nextInt();
 }
  public char M3(int a)
  {
   System.out.println(a);
  return sc.next().charAt(0);
 }
 
 public static void main(String[]args)
 {
  B x=new C();
  System.out.println(x.M1(sc.nextFloat()));
  System.out.println(x.M3(sc.nextInt()));
  System.out.println(x.M2(sc.nextInt()));
  System.out.println(x.M4(sc.nextShort()));


 }



}