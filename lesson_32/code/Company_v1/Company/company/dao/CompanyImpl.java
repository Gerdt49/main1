package Company_v1.Company.company.dao;

import Company_v1.Company.company.model.model.Employee;
import Company_v1.Company.company.model.model.SalesManager;

public class CompanyImpl implements Company {

    // pole , kotorie opisivaet  kompanij
    private  Employee[] employees;  // massiv dlj xranenia sotrudnikov
    private  int size;  // tekuschee kol_vo sotrudnikov v kompanii

    // konstuktor

    public CompanyImpl(int capacity){
        employees = new Employee[capacity]; //  capacity _ max kol-vo sotrudnikov , razmer  kompanij
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // ne dobavlayem null, ne preb. capacity i ne dobavl
        if(employee == null || size == employees.length  || findEmployee(employee.getId()) != null) {
            return  false;
        }
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i]; // ubrali element v peremenuj
                employees[i] = employees[size-1]; // na mesto najdenogo postavili poslednego
                employees[size-1] = null; // obnulili poslednego
                size--;
                 // TODO mogno koro4e
                return victim;
            }
        }
        return null;
    }
    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id ){    // naschelsy element massiva s id
             return employees[i]; //  vernuli rabotnika tipa Employee
            }
        }
        return null;
    }
    @Override
    public int quantuty() {
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
    public double avSalary() {
        return  totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) employees[i]; // KASTING
                res += salesManager.getSalesValue();
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
}
