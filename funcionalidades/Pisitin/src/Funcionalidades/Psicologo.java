package Funcionalidades;

import java.util.ArrayList;

public class Psicologo extends Usuario{
	private String CRPPsicologo;
	private ArrayList<Especialidade> especialidades;
    private double valorConsulta;
    private String formacao;
    private String disponibilidade;
    private String avaliacao;
    
	public Psicologo() {
		super();
	}
	
	public Psicologo(int idUser, String nome, String email, String telefone, String cidade, String sexo,
			String bio, String CRPPsicologo, ArrayList<Especialidade> especialidades, double valorConsulta, String formacao, String disponibilidade, String avaliacao) {
		super(idUser, nome, email, telefone, cidade, sexo, bio);
		this.CRPPsicologo = CRPPsicologo;
		this.especialidades = especialidades;
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


	public ArrayList<Especialidade> getEspecialidade() {
		return especialidades;
	}

	public void setEspecialidades(ArrayList<Especialidade> especialidade) {
		this.especialidades = especialidade;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
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
    
	/* imprime os atributos dos usuários do tipo psicólogo. 
	 * A entrada do método pode ser tanto "total" quanto "simples". No modo simples, 
	 * somente o nome do usuário e seu id serão imprimidos, enquanto que no modo total todos os atributos serão mostrados.
	 */
	public void show(String choice) {
		if (choice.equals("total")){
			System.out.println("Psicólogo " + this.getIdUser());
			this.showUser();
			System.out.println("CRP: " + this.getCRPPsicologo());
			
			System.out.println("Especialidades:");
			for(Especialidade esp:this.especialidades) {
				System.out.println(esp.getNome());
			}
			
			System.out.println("Valor da consulta:" + this.getValorConsulta() + " reais");
			System.out.println("Formação: " + this.getFormacao());
			System.out.println("Disponibilidade: " + this.getDisponibilidade());
			System.out.println("Avaliação: " + this.getAvaliacao());
			
		} 
		else if(choice.equals("simples")) {
			System.out.println("Psic[ologo " + this.getIdUser() + " - Nome: " + this.getNome() + " - Valor: " + this.getValorConsulta()+ "reais");
		}
	
	}
    
}
