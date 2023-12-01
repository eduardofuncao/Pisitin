package Funcionalidades;

public class Psicologo extends Usuario{
	private String CRPPsicologo;
	private String especialidade;
    private String valorConsulta;
    private String formacao;
    private String disponibilidade;
    private String avaliacao;
    
	public Psicologo() {
		super();
	}
	
	public Psicologo(int idUser, String nome, String email, String telefone, String cidade, String sexo,
			String bio, String CRPPsicologo, String especialidade, String valorConsulta, String formacao, String disponibilidade, String avaliacao) {
		super(idUser, nome, email, telefone, cidade, sexo, bio);
		this.CRPPsicologo = CRPPsicologo;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
		this.formacao = formacao;
		this.disponibilidade = disponibilidade;
		this.avaliacao = avaliacao;
	}

	public String getCRPPsicologo() {
		return CRPPsicologo;
	}

	public void setCRPPsicologo(String cRPPsicologo) {
		CRPPsicologo = cRPPsicologo;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(String valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
    
	public void show(String choice) {
		if (choice.equals("total")){
			System.out.println("Paciente " + this.getIdUser());
			this.showUser();
			System.out.println("CRP: " + this.getCRPPsicologo());
			System.out.println("Especialidade: " + this.getEspecialidade());
			System.out.println("Valor da consulta:" + this.getValorConsulta() + "reais");
			System.out.println("Formação: " + this.getFormacao());
			System.out.println("Disponibilidade: " + this.getDisponibilidade());
			System.out.println("Avaliação: " + this.getAvaliacao());
			System.out.println("Bio: " + this.getBio());
			
		} 
		else if(choice.equals("simples")) {
			System.out.println("Psic[ologo " + this.getIdUser() + " - Nome: " + this.getNome() + " - Valor: " + this.getValorConsulta()+ "reais");
		}
	
	}
    
}
