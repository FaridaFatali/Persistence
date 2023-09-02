package service;

import dao.AbstractDao;
import domain.Employee;

public class EmployeeService {
    private AbstractDao employeeDao;

    public EmployeeService(AbstractDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void createEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void changePassword(Employee employee, String newPassword) {
        employee.setPassword(newPassword);
        employeeDao.update(employee);
    }

}
