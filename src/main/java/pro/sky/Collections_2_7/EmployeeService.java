package pro.sky.Collections_2_7;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private Map<String, Employee> employeeMap = new HashMap<>();
    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }
    public Employee addEmployeeMap(String lastName, String firstName) {
        String key = lastName + firstName;
        if (employeeMap.containsKey(key))
            throw new EmployeeAlreadyAddedException("Этот сотрудник в базе есть");
        Employee employee = new Employee(lastName, firstName);
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
}
