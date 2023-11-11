package pro.sky.Collections_2_7;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public Map<String, Employee> showAllListEmployee() {
        return employeeService.getEmployeeMap();
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String lastName, @RequestParam String firstName, @RequestParam int salary, Employee.Department department) {
        return employeeService.addEmployeeMap(lastName, firstName, salary, department);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String lastName, @RequestParam String firstName) {
        return employeeService.deleteEmployeeMap(lastName, firstName);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String lastName, @RequestParam String firstName) {
        return employeeService.findEmployeeMap(lastName, firstName);
    }
    @GetMapping("/departments/all")
    public Map<Employee.Department, List<Employee>> sortListEmployee(){
        return employeeService.allListEmployee();
    }
    @GetMapping("/departments")
    public List<Employee> sortListEmployee(@RequestParam Employee.Department dep){
        return employeeService.allListEmployee(dep);
    }
    @GetMapping("/departments/min-salary")
    public Employee findMinSalary(@RequestParam Employee.Department dep) {
        return employeeService.minSalary(dep);
    }
    @GetMapping("/departments/max-salary")
    public Employee findMaxSalary(@RequestParam Employee.Department dep) {
        return employeeService.maxSalary(dep);
    }
}
