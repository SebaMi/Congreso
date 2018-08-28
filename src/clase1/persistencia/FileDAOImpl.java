package clase1.persistencia;

import java.io.BufferedInputStream;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import clase1.modelo.Employee;
import clase1.modelo.EmployeeDTO;

public class FileDAOImpl implements EmployeeDAO {
	
	File empleados;
	
	public FileDAOImpl()	{
		empleados = new File("empleados.txt");
	}

	@Override
	public void guardar(Employee employee) {
//		try(Writer output = new BufferedWriter(new FileWriter(empleados.getName(), true));){
//			output.write(employee.toString() + "\n");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		ObjectMapper mapper = new ObjectMapper();
		  
		String json;
		try (Writer output = new BufferedWriter(new FileWriter(empleados.getName(), true));){
			
			json = mapper.writerWithDefaultPrettyPrinter()
			                    .writeValueAsString(new EmployeeDTO(employee));
			output.write(json);
			//System.out.println("SALIDA JSON: \n" + json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		

	}

	@Override
	public List<Employee> recuperar() {
		return null;
	}

	@Override
	public List<String> recuperarEmpleados() {
		List<String> empleadosString = new ArrayList<>();
		try(FileInputStream fos = new FileInputStream(empleados);
			BufferedReader bw = new BufferedReader(new InputStreamReader(fos));){
			bw.lines().forEach(emp -> empleadosString.add(emp));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empleadosString;
	}

}
