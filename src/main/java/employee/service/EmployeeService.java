package employee.service;

import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import employee.adapter.EmployeeMapAdapter;
import employee.entity.Employee;

@WebService
public interface EmployeeService {
    @XmlJavaTypeAdapter(EmployeeMapAdapter.class)
    public Map<Integer, Employee> getEmployees();
    
    public Double getAverageSalary();
    
    public Double calculateSalary();
}
