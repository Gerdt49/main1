package Company.company.dao;

  //          добавить сотрудника
  //          удалить сотрудника
  //          найти сотрудника
 //           кол-во сотрудников
  //          ФОТ
   //         средняя з/п
   //         объем продаж
// напечатать список сотрудников


import Company.company.model.model.Employee;

public interface Company {
    //  Metod !
   boolean addEmployee(Employee employee); // добавить сотрудника
   Employee removeEmployee(int id); //  удалить сотрудника
   Employee findEmployee(int id); // найти сотрудника
   int quantuty();  // кол-во сотрудников
    double totalSalary(); // ФОТ , zarplara vsex
    double avSalary(); // средняя з/п

    double totalSales();

    void printEmployees(); // напечатать список сотрудников
// .....................
    //      - список работников, у которых отработано больше часов, чем...

    Employee[] findEmployeesHoursGreaterThan(int hours);


//      - список работников, у которых зарплата в интервале от... и до...
    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary); // Salary -zarplata


}
