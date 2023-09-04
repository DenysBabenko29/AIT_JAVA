package ait.company_employee.dao;

import ait.company_employee.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class CompanyArrayListImpl implements Company {

    ArrayList<Employee> employees;

    public CompanyArrayListImpl() {
        this(10);
    }

    public CompanyArrayListImpl(int capacity) {
        this.employees = new ArrayList<>(capacity);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || findEmployee(employee.getId()) != null){
            return false;
        }
        employees.add(employee);
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        if (findEmployee(id) != null){
            throw new RuntimeException();
        }
        Employee t = findEmployee(id);
        employees.remove(t);
        return t;
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees){
            if (e != null){
                if (e.getId() == id){
                    return e;
                }
            }
        }
        return null;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double averageSalary() {
        return Company.super.averageSalary();
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public int size() {
        return employees.size();
    }

    @Override
    public void printEmployees() {
        for (Employee e : employees){
            System.out.println(e);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreateThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeesSalaryBetween(double min, double max) {
        return new Employee[0];
    }

}
