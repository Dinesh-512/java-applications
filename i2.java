/* create a java application where we have one interface it contains two abstract and two two defined methods then provide functionality for them in a concrete class by providing D.I*/

import java.util.*;
interface A
{
 static Scanner sc=new Scanner(System.in);
 int M1(String a);
 float M2(short a);
 static String M3(long a)
 {
   System.out.println(a);
   return sc.next();

 }
  default long M4(char a)
  {
   System.out.println(a);
   return sc.nextLong();
  }

}
class c implements A
{
 public int M1(String a)
  {
   System.out.println(a);
   return sc.nextInt();
  }
  public float M2(short a)
  {
   System.out.println(a);
   return sc.nextFloat();
  }
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
   c x=new c();
   System.out.println(A.M3(sc.nextLong()));
   System.out.println(x.M4(sc.next().charAt(0)));
   System.out.println(x.M1(sc.next()));
   System.out.println(x.M2(sc.nextShort()));

  }



}