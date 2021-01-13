package com.java.obj;

public class JavaAbstractDemo {

    public static void main(String[] args) {
//        Employee3 e= new Employee3("George W.","Houston, TX",43);
        System.out.println("\n Call mailCheck using Employee reference--");
//        e.mailCherk();
        Salary4 s=new Salary4("Mohd Mohtashim","Ambehta,UP",3,36000.0);
        Employee4 e=new Salary4("John Adams","Boston, MA",2,24000.0);
        s.mailCherk();
        System.out.println("\n Call mailCheck using Employee reference --");
        e.mailCherk();
    }
}
class Salary4 extends Employee4{
    private double salary;
    public Salary4(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }
    public void setSalary(double newSalary){
        if (newSalary>=0.0){
            salary=newSalary;
        }
    }

    public void mailCherk() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to "+getName()+" with salary"+salary);
    }
    public double computePay() {
        System.out.println("Computing salary pay for "+getName());
        return salary/52;
    }

    public double getSalary() {
        return salary;
    }
}
abstract class Employee4{
    private String name;
    private String address;
    private int number;
    public Employee4(String name,String address,int number){
        System.out.println("Constructing an Employee");
        this.name=name;
        this.address=address;
        this.number=number;
    }
    public double computePay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }
    public void mailCherk(){
        System.out.println("Mailing a check to "+this.name+" "+this.address);
    }
    public String toString(){
        return name+" "+address+" "+number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }
}
