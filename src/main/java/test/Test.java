package test;

/**
 * @author Farida Fatali
 * Practice for Abstraction, Inheritance, Polymorphism and Design Patterns
 */

import dao.*;
import domain.*;
import service.*;

public class Test {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        EmployeeService employeeService = new EmployeeService(employeeDao);

        Employee employee = new Employee(5555, "Mehmet", 8, "Production", "aaa");
        employeeService.createEmployee(employee);
        employeeService.changePassword(employee, "aaa55");

        System.out.println();

        ProductDao productDao = new ProductDao();
        ProductService productService = new ProductService(productDao);

        Product product = new Product(333, "11111", "Phone", 1500, 0.1);
        productService.retrieveProduct(product);

    }
}
