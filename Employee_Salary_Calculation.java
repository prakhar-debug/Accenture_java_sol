//Main.java
    1 import java.util.*;
    2 public class Main{
    3     public static Employee getEmployeeDetails(){
    4         Scanner sc = new Scanner(System.in);
    5         Employee e = new Employee();
    6         System.out.println("Enter Id:");
    7         e.setEmployeeId(sc.nextInt());
    8         System.out.println("Enter Name:");
    9         e.setEmployeeName(sc.next());
   10         System.out.println("Enter salary:");
   11         e.setSalary(sc.nextDouble());
   12         return e;
   13     }
   14     public static int getPFPercentage()
   15     {
   16         Scanner sc = new Scanner(System.in);
   17         System.out.println("Enter PF percentage:");
   18         int val = sc.nextInt();
   19         return val;
   20     }
   21     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
           Employee e1 = getEmployeeDetails();
            int temp = getPFPercentage();
            e1.calculateNetSalary(temp);
            System.out.println("Id : "+e1.getEmployeeId());
            System.out.println("Name : "+e1.getEmployeeName());
            System.out.println("Salary : "+e1.getSalary());
            System.out.println("Net Salary : "+e1.getNetSalary());
        }
    }
//Employee.java
    1 public class Employee{
    2     private int employeeId;
    3     private String employeeName;
    4     private double salary;
    5     private double netSalary;
    6     public void setEmployeeId(int employeeId ){
    7         this.employeeId = employeeId ;
    8     }
    9     public int getEmployeeId(){
   10         return employeeId;
   11     }
   12     public void setEmployeeName(String employeeName){
   13         this.employeeName = employeeName;
   14     }
   15     public String getEmployeeName(){
   16         return this.employeeName;
   17     }
   18     public void setSalary(double salary){
   19         this.salary = salary;
   20     }
   21     public double getSalary(){
   22         return this.salary;
   23     }
        public void calculateNetSalary(int pf){
            double temp = (pf/100.00);
           setNetSalary(salary-(salary*(temp)));
        }
        public void setNetSalary(double netSalary){
            this.netSalary= netSalary;
        }
        public double getNetSalary(){
            return netSalary;
        }
        
    }
