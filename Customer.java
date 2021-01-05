    1 public class Customer{
    2     private String customerName;
    3     private long contactNumber;
    4     private String emailId;
    5     private int age;
    6     public Customer(){
    7         
    8     }
    9     
   10     //public Customer(String customerName,long contactNumber,String email,int age){
   11       //  this.customerName=customerName;
   12         //this.contactNumber=contactNumber;
   13         //this.email = email;
   14         //this.age=age;
   15     //}
   16     
   17     public void setCustomerName(String customerName){
   18         this.customerName=customerName;
   19     }
   20     public void setContactNumber(long contactNumber){
   21         this.contactNumber = contactNumber;
   22     }
   23     public void setEmailId(String emailId){
   24         this.emailId = emailId;
   25     }
   26     public void setAge(int age){
   27         this.age = age;
   28     }
   29      public String getCustomerName(){
   30          return customerName;
   31      }
   32      public long getContactNumber(){
   33          return contactNumber;
   34      }
   35      public String getEmailId(){
   36          return emailId;
   37      }
   38      public int getAge(){
   39          return age;
   }
   }
Main.java
    1 import java.util.*;
    2 public class Main{
    3     public static void main(String[] args){
    4         Scanner sc = new Scanner(System.in);
    5         Customer cu = new Customer();
    6         System.out.println("Enter the Name:");
    7         cu.setCustomerName(sc.nextLine());
    8         System.out.println("Enter the ContactNumber:");
    9         cu.setContactNumber(sc.nextLong());
   10         sc.nextLine();
   11         System.out.println("Enter the EmailId:");
   12         cu.setEmailId(sc.nextLine());
   13         System.out.print("Age:");
   14         cu.setAge(sc.nextInt());
   15         System.out.println("");
   16         
   17         System.out.println("Name:"+cu.getCustomerName());
   18         System.out.println("ContactNumber:"+cu.getContactNumber());
   19         System.out.println("EmailId:"+cu.getEmailId());
   20         System.out.println("Age:"+cu.getAge());
   21     }
   22 }
