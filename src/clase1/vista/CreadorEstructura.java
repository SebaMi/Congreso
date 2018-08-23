package clase1.vista;

import clase1.modelo.Employee;
import clase1.modelo.Votador;
import clase1.servicio.GestorEmpleados;

public class CreadorEstructura {

	public static void main(String[] args) {
		Employee presidente = GestorEmpleados.createEmployee(100, "Presidente", "presidencia");
		
		Employee jefeSenado = GestorEmpleados.createEmployee(200, "Jefe Senado", Employee.SENADO);
		GestorEmpleados.establecerJerarquia(jefeSenado, presidente);
		GestorEmpleados.generarEmpleados(jefeSenado);
		
		Employee jefeDiputado = GestorEmpleados.createEmployee(300,"Jefe Diputado", Employee.DIPUTADO);
		GestorEmpleados.establecerJerarquia(jefeDiputado, presidente);
		GestorEmpleados.generarEmpleados(jefeDiputado);
		
		for (Employee empleado : jefeSenado.getReportees()) {
			
			GestorEmpleados.generarAsesores(empleado);
		}
		
		for (Employee empleado : jefeDiputado.getReportees()) { 
			
			 GestorEmpleados.generarAsesores(empleado);
		}
	
		for (Votador empleado : presidente.getReportees()) {
			empleado.elegirVoto();
			System.out.println(empleado.getVotacion());
		}
		
		for(Votador empleado : jefeSenado.getReportees()) {
			empleado.elegirVoto();
			System.out.println(empleado.getVotacion());
		}
		
		for(Votador diputado : jefeDiputado.getReportees() ) {
			diputado.elegirVoto();
			System.out.println(diputado.getVotacion());
		}
		
		for(Employee empl : GestorEmpleados.obtenerEmpleados() ) {
			System.out.println(empl.toString());
		}
	}
	
//	private static Manager createManager(String nombre, String ubicacion, int legajo){
//	Manager man = new Manager();
//	man.setLegajo(legajo);
//	man.setName(nombre);
//	man.setUbicacion(ubicacion);
//	
//	return man;
//}
	
//	private static int generarRandomInt(int minimo, int maximo) {
//		Random generadorRandom = new Random();
//		int cantidad = generadorRandom.nextInt(maximo);
//		while(cantidad < minimo) {
//			cantidad = generadorRandom.nextInt(maximo);
//		}
//		
//		return cantidad;
//	}
	
	
//	private static List<Employee> generateRandomEmployees(int cantidad, String nombreBase, int legajoBase, Manager report){
//		List<Employee> employees = new ArrayList<Employee>();
//		Employee emp = null;
//		for (int i = 1; i <= cantidad; i++) {
//			emp = new Employee();
//			emp.setLegajo(legajoBase + i);
//			emp.setName(nombreBase+emp.getLegajo());
//			emp.setUbicacion(report.getUbicacion());
//			emp.setReportTo(report);
//			employees.add(emp);
//		}
//		
//		return employees;
//	}

	

}
