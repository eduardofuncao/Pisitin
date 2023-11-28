package Funcionalidades;

public class Paciente extends Usuario{
	private String idPaciente;
	private String planoSaude;
	
	
	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paciente(String idUser, String nome, String email, String telefone, String cidade, String sexo, String bio, String idPaciente, String planoSaude) {
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
	
	
	
	
}
