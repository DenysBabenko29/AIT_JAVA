package ait.employee;

import ait.employee.model.Employee;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Smidth", "Skotsch", 3500, true);
        Employee employee2 = new Employee();
        employee1.setSalary(2000);
        System.out.println(employee1.getSalary());

        double totalSalary = employee1.getSalary() + employee2.getSalary();

    }
}
