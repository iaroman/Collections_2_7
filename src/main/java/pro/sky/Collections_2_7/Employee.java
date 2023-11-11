package pro.sky.Collections_2_7;

import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.*;

public class Employee {
    private String lastName, firstName;
    private int salary;
    public enum Department {ONE, TWO, THREE, FOUR, FIVE};
    private Department department;
    static private int counter;
    private int id;
    public Employee(String lastName, String firstName, int salary, Department department) {
        this.lastName = capitalize(lastName.toLowerCase());
        this.firstName = capitalize(firstName.toLowerCase());
        this.salary = salary;
        this.department = department;
        id = ++counter;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Сотрудник: " + lastName + " " + firstName + " " + id;
    }
    public String getEmployee() {
        return "Сотрудник: " + lastName + " " + firstName + " " + id;
    }
    public static int compare (Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary())
            return 1;
        return -1;
    }
}
