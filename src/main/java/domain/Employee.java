package domain;

public class Employee extends Entity {
    protected String name;
    protected int year;
    protected String department;
    protected String password;

    public static final int BASE_SALARY = 500;

    public Employee(long id, String name, int year, String department, String password) {
        super(id);
        this.name = name;
        this.year = year;
        this.department = department;
        this.password = password;
    }

    public void work() {
        System.out.println("Employee is working!");
    }

    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee | " +
                "name - " + name +
                ", year - " + year +
                ", department - " + department +
                ", password - " + password;
    }
}
