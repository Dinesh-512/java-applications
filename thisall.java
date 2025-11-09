import java.util.*;
class A
{
  static Scanner sc=new Scanner(System.in);
  Boolean a=sc.nextBoolean();
   int M1(char a)
   {
       System.out.println(a);
       System.out.println(this.a);
       return sc.nextInt();
   }
   float M1()
   {
     System.out.println("this is M1");
     System.out.println(this.M1(sc.next().charAt(0)));
     return sc.nextFloat();

   }
   A(int a,long b)
   {
     System.out.println(a);
     System.out.println(b);
     System.out.println(this.a);
   }
   A ()
   {
    this(sc.nextInt(),sc.nextLong());
    System.out.println(a);
    }
    public static void main(String[]args)
    {
     A x=new A();
      System.out.println(x.M1());

    }


}