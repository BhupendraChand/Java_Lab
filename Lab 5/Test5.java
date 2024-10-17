
Package MyPackage;
public class Employee;
        {
    int EmployeeId;
    String EmployeeName;
    String EmployeeAddress;
    int Salary;
}
public void setEmployeeId(int EId)
{
EmployeeId=EId;
}

public int getEmployeeId()
{
 return EmployeeId=EId;
}

public void setEmployeeName(String EN)
{
EmployeeName=EN;
}

public String getEmployeeName()
{
 return EmployeeName=EN;
}

public void setEmployeeAddress(int EA)
{
EmployeeAddress=EA;
}

public String getEmployeeAddress()
{
 return EmployeeAddress=EA;
}

public void setEmployeeSalary(int ES)
{
EmployeeSalary=ES;
}
public int getEmployeeSalary()
{
return EmployeeSalary=ES;
}


Pakage Bank
import MyPack.*;
public class Test
{
    public static void main (String[] args)
    {
        Employee e1 = new Employee();
        e1.setEmployeeId("12");
        e2.setEmployeeName("Bhupendra Chand");
        e3.setEmployeeAddress("Dhangadhi");
        e4.setEmployeeSalary("25000");
        System.out.println("Employee ID="+e1.EmployeeId);
        System.out.println("Employee Name="+e2.EmployeeName);
        System.out.println("Employee Address="+e3.EmployeeAddress);
        System.out.println("Employee Salary="+e4.EmployeeSalary);
        
    }
}
