package com.java.pro;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("狗1 郭金龙");
        Employee e2 = new Employee("狗2 郭金龙");
        e.empAge(26);
        e.empDesignation("渣渣程序员");
        e.empSalary(100);
        e.printEmployee();

        e2.empAge(21);
        e2.empDesignation("渣渣测试");
        e2.empSalary(100);
        e2.printEmployee();
    }
}
