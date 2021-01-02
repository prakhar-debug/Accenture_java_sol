 1 import java.util.*;
    2 public class RegistrationDetails{
    3     public static void main(String[] args){
    4         Scanner sc= new Scanner(System.in);
    5         System.out.print("Enter your name:");
    6         String n = sc.nextLine();
    7         System.out.print("Enter your age:");
    8         int a = sc.nextInt();
    9         System.out.print("Enter your phoneno:");
   10         double no = sc.nextDouble();
   11         sc.nextLine();
   12         System.out.print("Enter your qualification:");
   13         String q = sc.nextLine();
   14         System.out.print("Enter your email id[Please provide valid id,after registering your registration id will be mailed]:");
   15         String e = sc.next();
   16         sc.nextLine();
   17         System.out.print("Enter your noofexperience[if any]:");
   18         float f = sc.nextFloat();
   19         
   20         System.out.println("Dear "+n+", Thanks for registering in our portal, registration id will be mailed to "+e+" within 2 working days");
   21     }
   22 }
