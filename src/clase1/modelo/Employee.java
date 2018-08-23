package clase1.modelo;

import java.util.ArrayList;
import java.util.List;


public class Employee implements Votador{
	private Employee reportTo;
	private int legajo;
	private String ubicacion;
	private String name;
	private List<Employee> reportees = null;
	private Boolean voto;
	
	public Employee() {
		reportees = new ArrayList<Employee>();
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getReportees() {
		return reportees;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}

	

	public Employee getReportTo() {
		return reportTo;
	}

	public void setReportTo(Employee reportTo) {
		this.reportTo = reportTo;
	}

	@Override
	public Boolean getDecisionVoto() {
		return voto;
	}

	@Override
	public void elegirVoto() {
		Boolean valorRetorno = null;
		if(reportees != null && reportees.size() > 2) {
			valorRetorno = Boolean.FALSE;
			if(ubicacion.equals(SENADO) && legajo % 2 == 0)
				valorRetorno = Boolean.TRUE;
			if(ubicacion.equals(DIPUTADO) && legajo % 3 == 0)
				valorRetorno = Boolean.TRUE;
		}
		voto = valorRetorno;
	}

	@Override
	public String getVotacion() {
		String votacion = this.getUbicacion()+" "+ this.getLegajo() +" voto: "+ this.getDecisionVoto(); 
		return votacion;
	}

	@Override
	public String toString() {
		return String.format("Employee [reportTo=%s, legajo=%s, ubicacion=%s, name=%s, reportees=%s]", reportTo!=null?reportTo.getName():"", legajo,
				ubicacion, name, reportees.size());
	}

	
	
	

//	@Override
//	public boolean puedeVotar() {
//		return (reportees != null && reportees.size() > 2);
//	}
	
	
}
