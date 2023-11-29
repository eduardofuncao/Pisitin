package Funcionalidades;

public class Preferencias {
	private String id;
	private String especialidade;
	private String formatoAtendimento;
	
	public Preferencias() {
		
	}
	
	public Preferencias(String id, String especialidade, String formatoAtendimento) {
		super();
		this.id = id;
		this.especialidade = especialidade;
		this.formatoAtendimento = formatoAtendimento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getFormatoAtendimento() {
		return formatoAtendimento;
	}

	public void setFormatoAtendimento(String formatoAtendimento) {
		this.formatoAtendimento = formatoAtendimento;
	}
	
	
}
