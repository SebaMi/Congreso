package clase1.modelo;

public class EmployeeDTO {
	private Integer legajo;
	private String ubicacion;
	private Integer reportTo;
	private String name;
	private Integer[] reportees;
	private Boolean voto;
	
	public EmployeeDTO (Employee empleado) {
		this.setLegajo(empleado.getLegajo());
		this.setUbicacion(empleado.getUbicacion());
		this.setName(empleado.getName());
		this.setVoto(empleado.getDecisionVoto());
		reportees = new Integer[empleado.getReportees().size()];
		for (int i=0; i<empleado.getReportees().size();i++) {
			this.setReportees(empleado.getReportees().get(i).getLegajo() , i);
		}
		this.setReportTo(empleado.getReportTo()!= null ? empleado.getReportTo().getLegajo():null);
	}
	
	
	public Integer getLegajo() {
		return legajo;
	}


	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public Integer getReportTo() {
		return reportTo;
	}


	public void setReportTo(Integer reportTo) {
		this.reportTo = reportTo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer[] getReportees() {
		return reportees;
	}


	public void setReportees(Integer reportees, Integer posicion) {
		this.reportees[posicion] = reportees;
	}


	public Boolean getVoto() {
		return voto;
	}


	public void setVoto(Boolean voto) {
		this.voto = voto;
	}
}
