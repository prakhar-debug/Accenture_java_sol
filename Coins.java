1 import java.util.*;
    2 public class Coins{
    3     public static void main(String[] args){
    4         Scanner sc = new Scanner(System.in);
    5         System.out.print("Enter the age:");
    6         int age = sc.nextInt();
    7         sc.nextLine();
    8         int s = 1;
    9         if(age>0){
   10             for(int i=0;i<3;i++){
   11                 s = s*age;
   12                 //System.out.println("Meenu gets "+s+" coins");
   13             }
   14             System.out.println("Meenu gets "+s+" coins");
   15         }
   16         else{
   17             System.out.println("Invalid Age");
   18         }
   19     }
   20 }
