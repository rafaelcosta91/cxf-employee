package employee.adapter;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import employee.entity.Employee;

public class EmployeeMapAdapter extends XmlAdapter<EmployeeMap, Map<Integer, Employee>> {
	@Override
	public Map<Integer, Employee> unmarshal(EmployeeMap v) throws Exception {
		Map<Integer, Employee> boundMap = new LinkedHashMap<Integer, Employee>();
		for (EmployeeMap.EmployeeEntry studentEntry : v.getEntries()) {
			boundMap.put(studentEntry.getId(), studentEntry.getEmployee());
		}
		return boundMap;
	}

	@Override
	public EmployeeMap marshal(Map<Integer, Employee> v) throws Exception {
		EmployeeMap valueMap = new EmployeeMap();
		for (Map.Entry<Integer, Employee> boundEntry : v.entrySet()) {
			EmployeeMap.EmployeeEntry valueEntry = new EmployeeMap.EmployeeEntry();
			valueEntry.setEmployee(boundEntry.getValue());
			valueEntry.setId(boundEntry.getKey());
			valueMap.getEntries().add(valueEntry);
		}
		return valueMap;
	}
}
