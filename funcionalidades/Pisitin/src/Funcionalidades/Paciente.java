package Funcionalidades;

public class Paciente extends Usuario{
	private String idPaciente;
	private String planoSaude;
	
	
	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paciente(int idUser, String nome, String email, String telefone, String cidade, String sexo, String bio, String idPaciente, String planoSaude) {
		super(idUser, nome, email, telefone, cidade, sexo, bio);
		this.idPaciente = idPaciente;
		this.planoSaude = planoSaude;
	}
	public String getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	// exibe as informações de uma instância da classe. Como entrada do método, o usuário pode entrar com as Strings total ou simples
	// Com total, o programa irá imprimir todas as informçaões sobre o paciene no console, enquanto que para a escolha de "simples", o 
	// programa somente irá imprimir o id e nome do usuário
	public void show(String choice) {
		if (choice.equals("total")){
			System.out.println("Paciente " + this.getIdUser());
			this.showUser();
			System.out.println("Plano de Saúde: " + this.getPlanoSaude());	
		} 
		else if(choice.equals("simples")) {
			System.out.println("Paciente " + this.getIdUser() + " - Nome: " + this.getNome());
		}
	
	}
	
	
}
