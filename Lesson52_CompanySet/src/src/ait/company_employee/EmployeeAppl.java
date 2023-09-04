package src.ait.company_employee;

import ait.company_employee.model.Employee;
import ait.company_employee.model.Manager;
import ait.company_employee.model.SalesManager;
import ait.company_employee.model.WageEmployee;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee[] firm = new Employee[6];
        firm[0] = new Manager(1000, "John", "Smith", 160, 5000, 5);
        firm[1] = new WageEmployee(2000, "Ann", "Smith", 160, 15);
        firm[2] = new SalesManager(3000, "Peter", "Jackson", 160, 25000, 0.1);
        firm[3] = new SalesManager(4000, "Rabindranat", "Anand", 80, 20000, 0.1);
        printArray(firm);
        double total = totalSalary(firm);
        System.out.println("Total salary = " + total);
    }
    public static void printArray(Object[] obj){
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null){
                System.out.println(obj[i]);
            }
        }
    }
    public static double totalSalary(Employee[] firm) {
        double sum = 0;
        for (int i = 0; i < firm.length; i++) {
            if (firm[i] != null) {
                sum += firm[i].calcSalary();
            }
        }
        return sum;
    }

}
