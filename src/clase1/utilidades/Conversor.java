package clase1.utilidades;

import clase1.modelo.Employee;
import clase1.modelo.EmployeeDTO;

public class Conversor {
	
	public static EmployeeDTO convert(Employee emp) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setLegajo(emp.getLegajo());
		dto.setName(emp.getName());
		dto.setReportTo(emp.getReportTo() != null ? emp.getReportTo().getLegajo():null);
		dto.setUbicacion(emp.getUbicacion());
		
		return dto;
	}
	
}
