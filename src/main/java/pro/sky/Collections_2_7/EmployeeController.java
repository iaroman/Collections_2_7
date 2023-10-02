package pro.sky.Collections_2_7;
import org.springframework.web.bind.annotation.*;

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
    public Employee addEmployee(@RequestParam String lastName, @RequestParam String firstName) {
        return employeeService.addEmployeeMap(lastName, firstName);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String lastName, @RequestParam String firstName) {
        return employeeService.deleteEmployeeMap(lastName, firstName);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String lastName, @RequestParam String firstName) {
        return employeeService.findEmployeeMap(lastName, firstName);
    }
}
