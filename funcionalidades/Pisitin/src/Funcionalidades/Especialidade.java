package Funcionalidades;

public class Especialidade {
	private String id;
	private String nome;
	private String curso;
	
	public Especialidade() {
		
	}
	
	public Especialidade(String id, String nome, String curso) {
		super();
		this.id = id;
		this.nome = nome;
		this.curso = curso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
