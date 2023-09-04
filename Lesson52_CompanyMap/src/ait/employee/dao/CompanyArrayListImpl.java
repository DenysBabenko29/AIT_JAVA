package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.model.SalesManager;

import java.util.*;
import java.util.function.Predicate;

public class CompanyArrayListImpl implements Company {

    List<Employee> employees;
    int capacity;

    public CompanyArrayListImpl(int capacity) {
        employees = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee);
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        if (victim != null) {
            employees.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return employees.stream()
                .filter(x -> id == x.getId())
                .findFirst()
                .orElse(null);
    }

    @Override
    public double totalSalary() {
        return employees.stream()
                .map(Employee::calcSalary)
                .reduce(0., (sum, x) -> sum += x);
    }

    @Override
    public double totalSales() {
        return employees.stream()
                .filter(x -> x instanceof SalesManager)
                .map(x -> ((SalesManager) x).getSalesValue())
                .reduce(0., (sum, x) -> sum += x);
    }

    @Override
    public int quantity() {
        return employees.size();
    }

    @Override
    public void printEmployees() {
        employees.stream().forEach(System.out::println);
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e -> e.getHours() >= hours);
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int min, int max) {
        Predicate<Employee> predicate = new Predicate<>() {
            @Override
            public boolean test(Employee t) {
                return t.calcSalary() >= min && t.calcSalary() < max;
            }
        };
        return findEmployeesByPredicate(predicate);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> batska) {
        return employees.stream()
                .filter(batska::test)
                .toArray(Employee[]::new);

//        for (Employee employee : employees) {
//            if (batska.test(employee)) {
//                count++;
//            }
//        }

//        Employee[] res = new Employee[count]; // создаем массив
//        for (int i = 0, j = 0; j < res.length; i++) {
//            if (batska.test(employees[i])) {
//                res[j++] = employees[i];
//            }
//        }
/*       int j = 0;
        for (Employee employee : employees) {
            if (batska.test(employee)) {
                res[j] = employee;
                j++;
            }
        }
        return res; // это ссылка на полученный массив
        */
    }
}
