package modelo;

import java.util.ArrayList;
import java.util.List;


public class Employee implements Votador{
	private Employee reportTo;
	private int legajo;
	private String ubicacion;
	private String name;
	private List<Employee> reportees = null;
	private boolean voto;
	
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
	public boolean getDecisionVoto() {
		// TODO Auto-generated method stub
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

//	@Override
//	public boolean puedeVotar() {
//		return (reportees != null && reportees.size() > 2);
//	}
	
	
}
