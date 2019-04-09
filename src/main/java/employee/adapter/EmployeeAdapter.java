package employee.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import employee.entity.Employee;
import employee.entity.EmployeeImpl;

public class EmployeeAdapter extends XmlAdapter<EmployeeImpl, Employee> {
	@Override
    public EmployeeImpl unmarshal(EmployeeImpl employee) throws Exception {
        return employee;
    }

	@Override
	public EmployeeImpl marshal(Employee employee) throws Exception {
		if (employee instanceof Employee) {
            return (EmployeeImpl) employee;
        }
        return new EmployeeImpl(employee.getFirstName(), employee.getLastName(), employee.getSalary());
	}

}
