package Funcionalidades;

public class ChatBot {
	private int id;
	private String dataInicio;
	private Usuario user;
	
	public ChatBot() {
		
	}
	
	public ChatBot(int id, String dataInicio, Usuario user) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	
}
