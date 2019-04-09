package employee.service;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;

import employee.entity.Employee;

@WebService(endpointInterface = "employee.service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
	private Map<Integer, Employee> employees = new LinkedHashMap<Integer, Employee>();

	public Map<Integer, Employee> getEmployees() {
		return employees;
	}

	public Double getAverageSalary() {
		// TODO Auto-generated method stub
		return Double.valueOf(100);
	}

	public Double calculateSalary() {
		// TODO Auto-generated method stub
		return Double.valueOf(200);
	}

}
