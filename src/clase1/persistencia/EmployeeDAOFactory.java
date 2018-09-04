package clase1.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmployeeDAOFactory {
	
	public String implementation = "";
	File file = new File("application.properties");	
	
	public EmployeeDAO createEmployeeDAO() {
		//Abrir archivo application.prperties
		//Buscar el valor de la propiedad dao.impl
		//Si la propiedad es file entonces
		//devolver FileDAOImpl
		//caso contrario devolver InMEmoryDAOImpl
		//Para buscar y cargar la propiedad usar
		//java.io.FileInputStream / ImputStream y
		// leer propiedades usando java.util.Properties
		
		if(implementation.equals("")) {
			Properties prop = new Properties();
		
			try(FileInputStream fos = new FileInputStream(file);
				){
				prop.load(fos);
				implementation = prop.getProperty("dao.impl");
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(implementation.equals("file"))
				return new FileDAOImpl();
		}
		return new InMemoryDAOImpl();
	}

}
