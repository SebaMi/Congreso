package clase1.persistencia;

import java.util.List;

import clase1.modelo.Employee;

public interface EmployeeDAO {
	
	public void guardar(Employee employee);
	
	public List<Employee> recuperar();
	
	public List<String> recuperarEmpleados();

}
