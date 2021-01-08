package com.java.pro;

public class EmployeePro {
    private static double income;
    public static final String Developer="渣渣工程师";
    public String name;
    private double salary;
    public EmployeePro(String ename){
        name=ename;
    }
    public void setSalary(double eSalary){
        salary=eSalary;
    }
    public void printEmp(){
        System.out.println("名字："+name);
        System.out.println("薪水："+salary);
    }

    public static void main(String[] args) {
        EmployeePro ep= new EmployeePro("郭狗狗");
        ep.setSalary(100.0);
        ep.printEmp();
        income=100.0;
        System.out.println(Developer+"平均工资"+income);
    }
}
