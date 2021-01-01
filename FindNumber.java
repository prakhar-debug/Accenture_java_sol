    1 import java.util.*;
    2 public class FindNumber{
    3     public static void main(String[] args){
    4         Scanner sc = new Scanner(System.in);
    5         int a = sc.nextInt();
    6         int b = 1;
    7         int count=1;
    8         
    9         if(a<=0){
   10             System.out.println("Invalid Input");
   11         }
   12         else{
   13             while(b<a){
   14             b = b*count;
   15             count++;    
   16             }
   17             if(a==1){
   18                 System.out.println(1);
   19                 
   20             }
   21             else if(b==a){
   22                 System.out.println(count-1);
   23             }
   24             else{
   25                 System.out.println("Sorry.The given number is not a perfect factorial");
   26             }
   27                     
   28         }
   29     } 
   30 }
