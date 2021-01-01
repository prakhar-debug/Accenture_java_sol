 1 import java.util.*;
    2 public class Triangle{
    3     public static void main(String[] args){
    4         Scanner sc = new Scanner(System.in);
    5         int[] a = new int[3];
    6         //ArrayList<Integer> a = new ArrayList<Integer>();
    7         for(int i =0;i<3;i++){
    8             System.out.println("Enter the value for side"+(i+1));
    9             int t =sc.nextInt();
   10                 a[i]=t;
   11             }
   12         
   13         int b = 3;
   14         for(int n:a){
   15             if(n==0){
   16                 System.out.println("Invalid Input");
   17                 b=5;
   18                 break;
   19             }
   20         }
   21         //int b = a.size();
   22         if(b==3){
   23           if(a[0]+a[1]>a[2]&& a[1]+a[2]>a[0]&& a[2]+a[0]>a[1]){
   24               System.out.println("Sides form a Triangle");
   25           }
   26           else{
   27               System.out.println("Sides does not form a Triangle");
   28           }
   29         }
   30      }
   31 }
