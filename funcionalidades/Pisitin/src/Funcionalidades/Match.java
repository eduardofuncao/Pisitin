package Funcionalidades;

import java.time.LocalDateTime;

public class Match {
	private int id;
	private LocalDateTime dataMatch;
	private Paciente p;
	private Psicologo psi;
	
	public Match() {
		
	}
	
	public Match(int id, LocalDateTime dataMatch, Paciente p, Psicologo psi) {
		super();
		this.id = id;
		this.dataMatch = dataMatch;
		this.p = p;
		this.psi = psi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDataMatch() {
		return dataMatch;
	}

	public void setDataMatch(LocalDateTime dataMatch) {
		this.dataMatch = dataMatch;
	}

	public Paciente getP() {
		return p;
	}

	public void setP(Paciente p) {
		this.p = p;
	}

	public Psicologo getPsi() {
		return psi;
	}

	public void setPsi(Psicologo psi) {
		this.psi = psi;
	}
	
	
	// Realiza a combinação entre um paciente e um psicólogo, retornando uma mensagem com essa informações e guardando a data do match
	public String combina() {
		this.dataMatch = LocalDateTime.now();
		return "Combinação entre " + this.p.getNome() + " e " + this.psi.getNome() + " feita em " + this.getDataMatch();
	}
	
}
