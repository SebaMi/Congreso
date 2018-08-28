package clase1.vista;

import clase1.modelo.Employee;
import clase1.modelo.Votador;
import clase1.servicio.GestorEmpleados;

public class CreadorEstructura {

	public static void main(String[] args) {
		Employee presidente = GestorEmpleados.createEmployee(100, "Presidente", "presidencia");
		
		Employee jefeSenado = GestorEmpleados.createEmployee(200, "Jefe Senado", Votador.SENADO);
		GestorEmpleados.establecerJerarquia(jefeSenado, presidente);
		GestorEmpleados.generarEmpleados(jefeSenado);
		
		Employee jefeDiputado = GestorEmpleados.createEmployee(400,"Jefe Diputado", Votador.DIPUTADO);
		GestorEmpleados.establecerJerarquia(jefeDiputado, presidente);
		GestorEmpleados.generarEmpleados(jefeDiputado);
				
		for (Employee empl : GestorEmpleados.obtenerEmpleados()) {
			System.out.println(empl);
		}
		
//		for (Votador empleado: presidente.getReportees()) {
//			empleado.elegirVoto();
//			System.out.println(empleado.getDecisionVoto());
//		}
		
	}
	
}
