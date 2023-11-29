package Funcionalidades;

public class Agendamento {
	private String data;
	private String hhora;
	private String linkReuniao;
	
	public Agendamento() {
		
	}
	
	public Agendamento(String data, String hhora, String linkReuniao) {
		super();
		this.data = data;
		this.hhora = hhora;
		this.linkReuniao = linkReuniao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHhora() {
		return hhora;
	}
	public void setHhora(String hhora) {
		this.hhora = hhora;
	}
	public String getLinkReuniao() {
		return linkReuniao;
	}
	public void setLinkReuniao(String linkReuniao) {
		this.linkReuniao = linkReuniao;
	}
	
	
}
