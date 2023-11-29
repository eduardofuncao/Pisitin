package Funcionalidades;

public class Sessao {
	private String id;
	private long tempoComeco;
	private long tempoFim;
	
	public Sessao() {
		
	}
	
	public Sessao(String id, long tempoComeco, long tempoFim) {
		super();
		this.id = id;
		this.tempoComeco = tempoComeco;
		this.tempoFim = tempoFim;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getTempoComeco() {
		return tempoComeco;
	}

	public void setTempoComeco(long tempoComeco) {
		this.tempoComeco = tempoComeco;
	}

	public long getTempoFim() {
		return tempoFim;
	}

	public void setTempoFim(long tempoFim) {
		this.tempoFim = tempoFim;
	}
	
	
}
