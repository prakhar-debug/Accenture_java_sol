 import java.util.*;
    2 public class ReverseNumber{
    3 public static void main(String[] args){
    4     Scanner sc = new Scanner(System.in);
    5     System.out.println("Enter The Number:");
    6     int num = sc.nextInt();
    7     int rem = 0;
    8     int rev = 0;
    9     if(num==0){
   10         System.out.println("Output is:0");
   11     }
   12     else{
   13         if(num>0){
   14             while(num!=0){
   15              rem = num%10;
   16             rev = rev*10+rem;
   17             num = num/10;
   18         }
   19         System.out.println("Output is:"+rev);
   20     }
   21     else{
   22         System.out.println("Number should be positive");
   23     }
   24         
   25     }
   26     }
   27     
   28 }
