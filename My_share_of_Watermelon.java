import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the weight of the watermelon in Kgs:");
            float kg = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter the number of friends:");
            float fr = sc.nextFloat();
            float m,b,f;
            float temp1,temp2,temp3;
            if(kg<=0||fr<=0){
                System.out.println("Invalid Input");
            }
            else{
                m = kg*25/100;
                b = kg-m;
                
                temp1 = (m*25/100);
                m = m-temp1;
                temp2 = (b*75/100);
                b = b-temp2;
                temp3 = temp1+temp2;
                f = temp3/fr;
                System.out.printf("My share of Watermelon %.2fKgs", m);
                System.out.println("");
                System.out.printf("My brother's share: %.2fKgs", b);
                System.out.println("");
               System.out.printf("Each of our friend's share: %.2fKgs", f);
           }
        }
        
   }
