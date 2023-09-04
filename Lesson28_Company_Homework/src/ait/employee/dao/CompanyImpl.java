package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.model.SalesManager;

import java.util.Arrays;

public class CompanyImpl implements Company {
    private Employee[] employees;
    private int size;

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees[size] = employee;
        size++;
        return true;
        // или employees[size++] = employee;
        // return true;

    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (id == employees[i].getId()) {
                Employee victim = employees[i];
                employees[i] = employees[i - 1];
                employees[i - 1] = null;
                size--;
                // или employees[i] = employees[--size];
                // employees[size] = null;
                return victim;
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
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {
                res += ((SalesManager) employees[i]).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        int j = 0;
        Employee[] resEmployee = new Employee[size];
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                resEmployee[j++] = employees[i];
            }
        }
        return Arrays.copyOf(resEmployee, j);
    }

    @Override
    public Employee[] findEmployeeSalaryRange(int minSalary, int maxSalary) {
        Employee[] resEmployee = new Employee[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].calcSalary() >= minSalary && employees[i].calcSalary() < maxSalary) {
                resEmployee[j++] = employees[i];
            }
        }
        return Arrays.copyOf(resEmployee, j);
    }
}