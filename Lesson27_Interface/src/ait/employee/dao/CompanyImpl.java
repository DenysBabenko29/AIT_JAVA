package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.model.SalesManager;

public class CompanyImpl implements Company {
    private Employee[] employees;
    private int size;

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || presenceID(employee) || size == employees.length) {
            return false;
        }
        employees[size] = employee;
        size++;
        return true;
    }

    public boolean presenceID(Employee newEmployee) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == newEmployee.getId())
                return true;
        }
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (id == employees[i].getId()) {
                Employee remove = employees[i];
                Employee temp = employees[size - 1];
                employees[size - 1] = null;
                employees[i] = temp;
                size--;
                return remove;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].calcSalary();
        }
        return sum;
    }

    @Override
    public double avgSalary() {
        double sumAVG = 0;
        for (int i = 0; i < size; i++) {
            sumAVG += employees[i].calcSalary();
        }
        return sumAVG / size;
    }

    @Override
    public double totalSales() {
        double sumSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager)
                sumSales += ((SalesManager) employees[i]).getSalesValue();
        }
        return sumSales;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
