package Funcionalidades;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Sessao {
	private int id;
	private LocalDateTime tempoComeco;
	private LocalDateTime tempoFim;
	private Usuario user;
	
	public Sessao() {
		
	}
	
	public Sessao(int id, LocalDateTime tempoComeco, LocalDateTime tempoFim, Usuario user) {
		super();
		this.id = id;
		this.tempoComeco = tempoComeco;
		this.tempoFim = tempoFim;
		this.user = user;
	}

	
	
	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getTempoComeco() {
		return tempoComeco;
	}

	public void setTempoComeco(LocalDateTime tempoComeco) {
		this.tempoComeco = tempoComeco;
	}

	public LocalDateTime getTempoFim() {
		return tempoFim;
	}

	public void setTempoFim(LocalDateTime tempoFim) {
		this.tempoFim = tempoFim;
	}
	
	// Define a data e hora de início de uma sessão e retorna uma mensagem com essas informações
	public String start(LocalDateTime tempoAtual) {
		this.setTempoComeco(tempoAtual);
		return "Sessão iniciada em " + tempoAtual + " para " + this.user.getNome();
	}
	
	// Defini a data e hora do final de uma sessão e retorna uma mensagem com essas informações, também contendo a duração da sessão
	public String end(LocalDateTime tempoAtual) {
		this.setTempoFim(tempoAtual);
		int duracao = (int) ChronoUnit.SECONDS.between(this.getTempoComeco(), this.getTempoFim()); 
		return "Sessão finalizada em: " + tempoAtual + "\nTempo decorrido durante a sesão: " + duracao + " segundos";
	}
	
}
