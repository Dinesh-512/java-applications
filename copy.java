/*import java.util.*;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a =sc.nextInt();
  A( A x )
 {

 System.out.println(a);
 System.out.println(x.a);
 
 }
 A()
 {

 System.out.println("default");

 }
 public static void main(String[]args)
 {
 A y= new A();
 new A( y );

 }
 }*/
/*import java.util.*;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a ;
  String b;
  A(int c,String d)
  {

  a=c;
  b=d;
  System.out.println("values assigned");

  }
  A(A x)
  {
   System.out.println(x.a);
   System.out.println(x.b);
  }

  public static void main(String[]args)
 {
  A y=new A(sc.nextInt(),sc.next());
  new A(y);
 }

 }*/
import java.util.*;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a=sc.nextInt() ;
  A()
  {
    System.out.println("default");

   }
  A(String a)
  {
  System.out.print(a);
  
  }
  A(String a, int b)
  {
   System.out.print(a);
   System.out.print(b);
   new A(sc.next());

  }
  A(A x)
  {
   System.out.print(a);
   System.out.print(x.a);
   new A(sc.next(),sc.nextInt());


  }
  public static void main(String[]args)
 {
  A x=new A();
  A y=new A(x);
 }

 }

/*import java.util.*;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a=sc.nextInt() ;
  A()
  {
    System.out.println("default");

   }
   A(A x)
  {
   System.out.println(a+" second");
   System.out.print(x.a+" default dhi");
   
  }
     A(A y,String a)
  {
   System.out.println(a);
   System.out.print(y.a);
   
  }
  public static void main(String[]args)
  {
   new A(new A(new A()),sc.next()); 
  }

 }*/

  

