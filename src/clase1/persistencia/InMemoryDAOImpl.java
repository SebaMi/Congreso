package clase1.persistencia;

import java.util.ArrayList;
import java.util.List;

import clase1.modelo.Employee;

public class InMemoryDAOImpl implements EmployeeDAO {

	private List<Employee> empleados = new ArrayList<Employee>();
	
	@Override
	public void guardar(Employee employee) {
		empleados.add(employee);
	}

	@Override
	public List<Employee> recuperar() {
		
		return empleados;
	}

	@Override
	public List<String> recuperarEmpleados() {
		List<String> empleadosString = new ArrayList<String>();
		for (Employee employee : empleados) {
			empleadosString.add(employee.toString());
		}
		return empleadosString;
	}

}
