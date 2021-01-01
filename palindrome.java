1 import java.util.*;
    2 public class Palindrome{
    3     public static void main(String[] args){
    4         Scanner sc = new Scanner(System.in);
    5         int a = sc.nextInt();
    6         int temp =a;
    7         int sum = 0;
    8         int r;
    9         if(a<0){
   10             System.out.println("Invalid Input");
   11         }
   12         else{
   13             while(a>0){
   14                 r = a%10;
   15                 sum=(sum*10)+r;
   16                 a=a/10;
   17             }
   18             if(temp==sum){
   19                 System.out.println("Palindrome");
   20             }
   21             else{
   22                 System.out.println("Not a Palindrome");
   23             }
   24         }
   25     }
   26 }
