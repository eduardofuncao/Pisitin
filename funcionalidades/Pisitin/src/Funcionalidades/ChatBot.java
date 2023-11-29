package Funcionalidades;

public class ChatBot {
	private String id;
	private String dataInicio;
	
	public ChatBot() {
		
	}
	
	public ChatBot(String id, String dataInicio) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	
}
