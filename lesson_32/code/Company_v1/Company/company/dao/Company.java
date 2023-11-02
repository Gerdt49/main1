package Company_v1.Company.company.dao;

  //          добавить сотрудника
  //          удалить сотрудника
  //          найти сотрудника
 //           кол-во сотрудников
  //          ФОТ
   //         средняя з/п
   //         объем продаж
// напечатать список сотрудников


import Company_v1.Company.company.model.model.Employee;

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



}
