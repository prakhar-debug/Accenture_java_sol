 import java.util.*;
 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s;
         int cn;
         do{
         //System.out.println("Enter the service type:");
          s = sc.nextLine();
         
         Token t = new Token(s);
         int tn = t.getTokenNumber();
          cn = t.getCounterNumber();
         if(cn!=0){
         System.out.println("Your Token number is:"+tn+" and Counter number is"+cn);
         }}while(cn!=0);
    }
    
 }
   
   
   
//Token.java
    public class Token{
        private static int tokenNumber=0;
        private int counterNumber;
        private String serviceType;
        public Token(String a){
            this.serviceType = a;
            switch(serviceType){
                case "Deposit":
                    this.counterNumber = 3;
                    break;
                case "Withdraw":
                    this.counterNumber =2;
                   break;
                case "Cheque deposit":
                    this.counterNumber=1;
                    break;
                case "Others":
                    this.counterNumber = 4;
                    break;
            }
            tokenNumber = tokenNumber+1;
        }
        public static int getTokenNumber(){
            return tokenNumber;
        }
        public int getCounterNumber(){
            return this.counterNumber;
        }
       public String getServiceType(){
            return this.serviceType;
       }
   }
