package com.joseloya.Manager;

public class Employee {
    //attributes
    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    private double basicSalary;
    private double specialAllowance = 250.80;
    private double hra = 1000.50;

    //constructors
    /*public Employee(){
        this.employeeId = 0;
        this.employeeName = "None";
        this.employeeAddress = "None";
        this.employeePhone = 0000000000L;
        this.basicSalary = 0.0;
        this.specialAllowance = 250.80;
        this.hra = 1000.50;
    }*/

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    public double calculateSalary(){
        double salary;
        salary = this.basicSalary
                + (basicSalary * specialAllowance/100)
                + (basicSalary * hra/100);
        return salary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateTransportAllowance(){
        return get10PercentOfBasicSalary((10/100) * basicSalary);
    }

    private double get10PercentOfBasicSalary(double v) {
        return (100);
    }


}
