import java.util.*;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a =sc.nextInt();
  void M1()
  {
  System.out.println("this is M1");
  }
  int M1(int a)
  {
   System.out.println(a);
   System.out.println(this.a);
   this.M1();
   return sc.nextInt();
  }
  A()
  {
    System.out.println("this is default A");
  }
  A(String a)
  {
   this();
   System.out.println(a);
   System.out.println(this.a);
  }
  
}
class B extends A
{
  int a=sc.nextInt();
  int M1(int a)
  {
    System.out.println(a);
    System.out.println(super.a);
    System.out.println(this.a);
    System.out.println(super.M1(sc.nextInt()));
    return sc.nextInt();
  }
  B(int a)
  {
   super(sc.next());
   System.out.println(a);
   System.out.println(this.a);
  }
  B()
  {
   this(sc.nextInt());
  }
  public static void main(String[]args)
  {
   B x=new B();
   System.out.println(x.M1(sc.nextInt()));


   }
  


}