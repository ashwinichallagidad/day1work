class Employee 
{  public double salary;
    public void setSalary(double sal) 
{ if (sal >= 0) { 
      salary = sal; 
     } 
  else {
     System.out.println("Invalid salary amount!");
      }
 }
 public double getSalary() {
     return salary;
      } 
 }
 public class EmployeeTest
  { public static void main(String[] args) 
   { Employee emp = new Employee(); 
    emp.setSalary(50000); 
     System.out.println("Employee Salary: " + emp.getSalary());
      emp.setSalary(-1000); 
   }
  } 