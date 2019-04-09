package employee.entity;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Student")
public class EmployeeImpl implements Employee {
	Long id;
	String firstName;
	String lastName;
	Double salary;
	
	
	public EmployeeImpl() {}
	
	public EmployeeImpl(String firstName, String lastName, Double salary) {
		this.id = new Double(Math.random() * 1000).longValue();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
