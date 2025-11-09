import java.util.*;
class Restaurant
{
   static Scanner sc=new Scanner(System.in);
   int CB(int quantity)
   {
      int a=quantity*220;
       return a;

   }

   int MB(int quantity)
   {
      int a=quantity*340;
       return a;

   }
   int VB(int quantity)
   {
      int a=quantity*210;
       return a;

   }
 

}
class Swiggy extends Restaurant
{
 double bill=0;
 double total=0; 
 void order()
 {
   System.out.println("select 1-menu/2-bill");
   int n=sc.nextInt();
   if(n==1)
   {
    int p= menu();
    total+=p;
   }
   else if(n==2)
   {
      if(total==0)
      {

       System.out.println("please the items then come back to bill selection-Thank you");
      int p=menu();
      total+=p;
      }
      else
      {
      Bill();
      }
   }
   else
   {
    System.out.println("Invalid Input");
      order();
    }
   System.out.println(" press 1 to continue orders selection and for exit press any key");
        int D=sc.nextInt();
        if(D==1)
        {
         order();
         }
         else
         {
          System.out.println("thank you :)");
     
          }

    
 }
 int menu()
 {
  System.out.println("chicken biryani -220/-");
  System.out.println("Mutton biryani -340/-");
  System.out.println("Veg biryani -210/-");
  System.out.println("select 1-chicken biryani/2-Mutton biryani/3-veg biryani");
  int l=sc.nextInt();
 if(l>=1 && l<=3)
{
  if(l==1)
  {
   System.out.println("enter Quantity:");
   int c=CB(sc.nextInt());
   return c;
  }
  if(l==2)
  {
   System.out.println("enter Quantity:");
   int c=MB(sc.nextInt());
   return c;
  }
  if(l==3)
  {
   System.out.println("enter Quantity:");
   int c=VB(sc.nextInt());
   return c;
  }
}
else
{
  System.out.println("Invalid input");     
}

return 0;

 }
 void Bill( )
 {
  int tax=20;
   System.out.println("your tax on bill is:"+tax);
   double gst=total*0.15;
   System.out.println("your gst on bill is:"+gst);
   double discount=total*0.20;
   System.out.println("your discount on bill is:"+discount);
   bill=total+tax+gst-discount;
   System.out.println("your bill is :"+bill);

 }
}
class Zomato extends Restaurant
{
 double bill=0;
 double total=0; 
 void order()
 {
   System.out.println("select 1-menu/2-bill");
   int n=sc.nextInt();
   if(n==1)
   {
    int p= menu();
    total+=p;
   }
   else if(n==2)
   {
      if(total==0)
      {

       System.out.println("please the select items then come back to bill selection-Thank you");
      int p=menu();
      total+=p;
      }
      else
      {
      Bill();
        }
      
   }
   else
   {
     System.out.println("Invalid Input");
      order();
   }
   System.out.println(" press 1 to continue orders selection and for exit press any key");
        int D=sc.nextInt();
        if(D==1)
        {
         order();
         }
         else
         {
          System.out.println("thank you :)");
     
          }


 }
 int menu()
 {
  System.out.println("chicken biryani -220/-");
  System.out.println("Mutton biryani -340/-");
  System.out.println("Veg biryani -210/-");
  System.out.println("select 1-chicken biryani/2-Mutton biryani/3-veg biryani");
  int l=sc.nextInt();
  if(l==1)
  {
   System.out.println("enter Quantity:");
   int c=CB(sc.nextInt());
   return c;
  }
  if(l==2)
  {
   System.out.println("enter Quantity:");
   int c=MB(sc.nextInt());
   return c;
  }
  if(l==3)
  {
   System.out.println("enter Quantity:");
   int c=VB(sc.nextInt());
   return c;
  }

return 0;

 }
 void Bill( )
 {
   int tax=20;
   System.out.println("your tax on bill is:"+tax);
   double gst=total*0.15;
   System.out.println("your gst on bill is:"+gst);
   double discount=total*0.20;
   System.out.println("your discount on bill is:"+discount);
   bill=total+tax+gst-discount;
   System.out.println("your bill is :"+bill);

 }
}

class User 
{
 public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("select 1-Swiggy/2-Zomato");
   int j=sc.nextInt();
   if(j==1)
   {
    Swiggy  x1= new Swiggy();
    x1.order();

   }
   else if(j==2)
   {
    Zomato x2=new Zomato();
    x2.order();

   }
   else
   {
    System.out.println("invalid input");
    main(null);
   }
  }
}