import java.util.*;
class Airtel
  {
     static Scanner sc=new Scanner(System.in);
     int recharge( char plan)
     {
         int a=900;
         int b=600;
         int c=400;
                  if(plan=='a')
                  {
                  return a;
                  }
                 if(plan=='b')
                  {
                  return b;}
                  if(plan=='c')
                  {
                  return c;
                  }
           return 0;
                   

       }
     }



 class cellshop extends Airtel
  {
     int k=0;
     int c=0;
       int plans()
       {
         String a="A-84days/2.5 gb per day,unlimited calls";
         String b="B-56days/2.5 gb per day,unlimited calls";
         String c="C-28days/2.5 gb per day,unlimited calls";
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println("enter the plan to see recharge Amount:");
          int s=recharge(sc.next().charAt(0));
           System.out.println(s);
        return s;
       }

      void bill(int a)
      {
        int tax=23;
        int bill=a+tax;
         System.out.println("bill Amount:"+bill);

     }
     void selection()
     {
       
       System.out.println("1-plans& 2-bill");
       int choice=sc.nextInt();
       if(choice==1)
       {
       c=plans();
        k++;
       }
       else if(choice==2)
       {
        if (k == 0) {
            System.out.println("Please select a plan first before viewing the bill.");
             c=plans();}
             else{
             bill(c);}
        }
        else
        {
          System.out.println("invalid input");

        }
        System.out.println(" press 1 to continue selection and for exit press any key");
        int k=sc.nextInt();
        if(k==1)
        {
         selection();
         }
         else
         {
          System.out.println("thank you :)");
     
          }
      
     }


 }
class user extends cellshop
{

   public static void main(String[]args)
   {
    user x=new user();
      x.selection();


    }

}