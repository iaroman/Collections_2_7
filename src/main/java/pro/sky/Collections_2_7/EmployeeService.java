package pro.sky.Collections_2_7;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeService {
    private Map<String, Employee> employeeMap = new HashMap<>();
    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }
    public Employee addEmployeeMap(String lastName, String firstName, int salary, Employee.Department department) {
        String key = lastName + firstName;
        if (employeeMap.containsKey(key))
            throw new EmployeeAlreadyAddedException("Этот сотрудник в базе есть");
        Employee employee = new Employee(lastName, firstName, salary, department);
        employeeMap.put(key, employee);
        return employee;
    }
    public Employee deleteEmployeeMap(String lastName, String firstName) {
         String key = lastName + firstName;
        if (employeeMap.containsKey(key))
            return employeeMap.remove(key);
        throw new EmployeeNotFoundException("Этот сотрудник не найден");
    }
    public Employee findEmployeeMap(String lastName, String firstName) {
        String key = lastName + firstName;
        if (employeeMap.containsKey(key))
            return employeeMap.get(key);
        throw new EmployeeNotFoundException("Этот сотрудник не найден");
    }
    public List<Employee> allListEmployee(Employee.Department department) {
        List<Employee> employeeList = employeeMap.values()
                .stream()
                .filter(e -> e.getDepartment() == department)
                .collect(Collectors.toList());
        return employeeList;
    }
    public List<Employee> allListEmployee() {
        List<Employee> employeeList = employeeMap.values()
                .stream()
                .sorted(Comparator.comparing(Employee::getDepartment))
                .collect(Collectors.toList());
        return employeeList;
    }
    public Employee minSalary(Employee.Department department) {
        Employee min = employeeMap.values()
                .stream()
                .filter(e -> e.getDepartment() == department)
                .min(Employee::compare)
                .get();
        return min;
    }
    public Employee maxSalary(Employee.Department department) {
        Employee max = employeeMap.values()
                .stream()
                .filter(e -> e.getDepartment() == department)
                .max(Employee::compare)
                .get();
        return max;
    }
}
