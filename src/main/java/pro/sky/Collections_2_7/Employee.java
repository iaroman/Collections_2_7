package pro.sky.Collections_2_7;
public class Employee {
    private String lastName, firstName;
    static private int counter;
    private int id;
    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        id = ++counter;
    }

    public String getLastName() {
        return lastName;
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
}
