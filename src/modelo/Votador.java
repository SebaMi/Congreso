package modelo;

public interface Votador {
	
	//public boolean puedeVotar();
	public Boolean getDecisionVoto();
	public void elegirVoto();
	String getVotacion();
	String SENADO = "senado";
	String DIPUTADO = "congreso";

}
