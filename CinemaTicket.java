    1 import java.util.*;
    2 import java.text.DecimalFormat;
    3 public class CinemaTicket{
    4     static void cal(int num,double cost1,String refreshment1,String coupon1){
    5         //DecimalFormat df2 = new DecimalFormat("#.#0");
    6         double n1 =cost1;
    7         if(num>20){
    8             n1 = n1-(cost1*0.10);
    9         }
   10         if(coupon1.equals("y")||coupon1.equals("Y")){
   11             n1 = n1-(n1*0.02);
   12         }
   13         if(refreshment1.equals("y")||refreshment1.equals("Y")){
   14             n1 = n1+(50*num);
   15             //n1 = df2.format(n1);
   16             
   17             System.out.printf("Ticket cost: %.2f\n",n1);
   18         }else{
   19             System.out.printf("Ticket cost:%.2f\n",n1);
   20         }
   21         
   22     }
   23     public static void main(String[] args){
   24         Scanner sc = new Scanner(System.in);
   25         System.out.print("Enter the no of ticket:");
   26         int num = sc.nextInt();
   27         sc.nextLine();
               if(num>=5&num<=40){
   28         System.out.print("Do you want refreshment:");
   29         String refreshment = sc.nextLine();
   30         System.out.print("Do you have coupon code:");
   31         String coupon =sc.nextLine();
   32         System.out.print("Enter the circle:");
   33         String circle = sc.nextLine();
   34         double c =0;
   35         double d =0;
   36         
   37             if((circle.equals("k"))|| (circle.equals("K"))){
   38                 c = 75*num;
   39                 cal(num,c,refreshment,coupon);
   40                 
   41             }else if ((circle.equals("q"))||(circle.equals("Q"))){
   42                 d = 150*num;
   43                 cal(num,d,refreshment,coupon);
   44             }
   45             else{
   46                 System.out.println("Invalid Input");
   47             }
   48             
   49         }
   50         else{
   51             System.out.println("Minimum of 5 and Maximum of 40 Tickets");
   52         }
   53         
   54         
   55     }
   56 }
