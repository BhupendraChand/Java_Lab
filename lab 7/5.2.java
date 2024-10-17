package com.myexample.Example5.myPackage
public class Example{
    private int EID;
    private String Ename;
    private double salary;

    public Employee(int EID, String Ename, double salary) {
        this.EID = EID;
        this.Ename = Ename;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + EID);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Salary: $" + salary);
    }
}