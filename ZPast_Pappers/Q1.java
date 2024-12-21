package ZPast_Pappers;

import java.util.Scanner;

class Employee {

    String empId;
    String empName;
    String jobTitle;
    double mSalary;

    public Employee(){}


    public void Read(String empId, String empName, String jobTitle, double mSalary){
        this.empId = empId;
        this.empName = empName;
        this.jobTitle = jobTitle;
        this.mSalary = mSalary;

    }

    public void Display(String empId, String empName, String jobTitle, double mSalary){

        System.out.println();

        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Job Title: " + this.jobTitle);  
        System.out.println("Monthly Salary: " + this.mSalary);
       
    }
    

    public double CalculateAnnualSalary(){
        
        return this.mSalary*12;
    }

    public double CalculateTax(){

        double CalcTax =  CalculateAnnualSalary() * 20/100;

        return CalcTax;
    }

}

class Department{
    
}



public class Q1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Employee Name: ");    
        String empName = sc.nextLine();


        System.out.print("Enter Job Title: ");
        String jobTitle = sc.nextLine(); 

        System.out.print("Enter Monthly Salary: ");
        double mSalary = sc.nextDouble();

        sc.close();

        Employee emp = new Employee();
        emp.Read(empId, empName, jobTitle, mSalary);
        emp.Display(empId, empName, jobTitle, mSalary);
       
       System.out.println(" ");
       System.out.println("Employee Annual Salary is : " +  emp.CalculateAnnualSalary());
    
        System.out.println();
        System.out.println("Employee Annual Tax is : " + emp.CalculateTax());
    
    }
    
} 