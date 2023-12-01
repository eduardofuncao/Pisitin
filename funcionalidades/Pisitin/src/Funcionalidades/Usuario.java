package Funcionalidades;

public class Usuario {
    private int idUser;
    private String nome;
    private String email;
    private String telefone;
    private String cidade;
    private String sexo;
    private String bio;
    
    public Usuario() {
    	
    }
    
	public Usuario(int idUser, String nome, String email, String telefone, String cidade, String sexo, String bio) {
		this.idUser = idUser;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
		this.sexo = sexo;
		this.bio = bio;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	
	protected void showUser() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Cidade: " + this.getCidade());
		System.out.println("Sexo: " + this.getSexo());
	}
    
    
}
