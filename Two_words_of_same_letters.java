//Main.java
    1 import java.util.*;
    2 public class Main{
        public static int len123(String w){
           int n= w.length();
            int c=0;
           for(int i =0;i<n;i++){
               for(int j =i+1;j<n;j++){
             if(w.charAt(i)==w.charAt(j)){
                  c=c+1;
              }
            }
   12         //c = n-c;
   13         //System.out.println(c);
   14         }
   15         c = n-c;
   16         //System.out.println(c);
   17         return c;
   18         
   19     }
   20 
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
   23         String word1 = sc.nextLine();
   24         String word2 = sc.nextLine();
   25         word1 = word1.toLowerCase();
   26         word2 = word2.toLowerCase();
   27         int w1 = len123(word1);
   28         int w2 = len123(word2);
   29         String word3;
   30         int l1 = word1.length();
   31         int l2 = word2.length();
   32         int temp;
   33         if(l1<l2){
   34             temp = l1;
   35             l1=l2;
   36             l2=temp;
   37             word3 = word1;
   38             word1 = word2;
   39             word2=word3;
   40             
   41         }
   42         boolean b = false;
   43         for(int i = 0;i<l1;i++){
   44             for(int j =0;j<l2;j++){
   45                 if(word1.charAt(i)==word2.charAt(j)){
   46                     b = true;
   47                     break;
   48                 }
   49                 b =false;
   50                     
   51                 }
   52                 
   53                 if(b==false){
   54                     break;
   55                 }
   56                 
   57             }
   58         
   59         if((w1==w2)&&(b==true)){
   60             System.out.println("Same");
   61         }else{
   62             System.out.println("Different");
   63         }
   64         
       }
    }
