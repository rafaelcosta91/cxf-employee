package employee.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import employee.adapter.EmployeeAdapter;

@XmlJavaTypeAdapter(EmployeeAdapter.class)
public interface Employee {
	public Long getId();
	public String getFirstName();
	public String getLastName();
	public Double getSalary();
}
