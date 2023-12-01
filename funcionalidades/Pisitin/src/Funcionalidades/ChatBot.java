package Funcionalidades;

public class ChatBot {
	private int id;
	private String dataInicio;
	
	public ChatBot() {
		
	}
	
	public ChatBot(int id, String dataInicio) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
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
