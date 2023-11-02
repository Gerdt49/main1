package Company.company.dao;

import Company.company.model.model.Employee;
import Company.company.model.model.SalesManager;

public class CompanyImpl implements Company{

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
      //  employees[size] = employee;
      //  size++;
        employees[size++] = employee; // ++ postfiksnay operazia



        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i]; // ubrali element v peremenuj
            //    employees[i] = employees[size-1]; // na mesto najdenogo postavili poslednego
             //   employees[size-1] = null; // obnulili poslednego
              //  size--;
                 // TODO mogno koro4e
                employees[i] = employees[--size];  // prefekosnay operazia -38 stroka
                employees[size] = null; // obnuljem


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
        for (int i = 0; i <= size; i++) {
            System.out.println(employees[i]);
        }
    }
    // Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
    // сначала подсчитать количество элементов массива, удовлетворяющих условию.
    //потом создать массив под это количество,
    //и только потом его заполнить.

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        // c4itaem skolko budet elementov massiva
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() > hours){
                count++;
            }
        }
        Employee[] res = new Employee[count]; // sozdaem massiv rasmerom  count
        // zapoln massiv res
        for (int i = 0, j = 0; j < res.length ; i++) {
            if(employees[i].getHours() > hours) {
                res[j++] = employees[i];
            }
        }

        return res;
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count  =0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                count++;
            }

        }
        Employee[] res = new Employee[count]; // sozdaem massiv rasmerom  count
        // zapoln massiv res
        for (int i = 0, j = 0; j < res.length ; i++) {
            if(employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                res[j++] = employees[i];
            }
        }

        return res;
    }
}
