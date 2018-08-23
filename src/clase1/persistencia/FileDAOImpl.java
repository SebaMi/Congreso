package clase1.persistencia;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import clase1.modelo.Employee;

public class FileDAOImpl implements EmployeeDAO {
	
	File empleados = new File("empleados.txt");

	@Override
	public void guardar(Employee employee) {
		

	}

	@Override
	public List<Employee> recuperar() {
		try {
			InputStream lectura = new BufferedInputStream(new FileInputStream(empleados));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> recuperarEmpleados() {
		
		return null;
	}

}
