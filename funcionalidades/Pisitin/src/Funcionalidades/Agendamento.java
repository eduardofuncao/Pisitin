package Funcionalidades;

import java.util.ArrayList;
import java.util.Arrays;

public class Agendamento {
	private String data;
	private String hora;
	private String linkReuniao;
	private Paciente p;
	private Psicologo psi;
	
	
	public Agendamento() {
		
	}
	
	public Agendamento(String data, String hhora, String linkReuniao, Paciente p, Psicologo psi) {
		super();
		this.data = data;
		this.hora = hhora;
		this.linkReuniao = linkReuniao;
		this.p = p;
		this.psi = psi;
	}
	
	
	
	public Paciente getP() {
		return p;
	}

	public void setP(Paciente p) {
		this.p = p;
	}

	public Psicologo getPsi() {
		return psi;
	}

	public void setPsi(Psicologo psi) {
		this.psi = psi;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLinkReuniao() {
		return linkReuniao;
	}
	public void setLinkReuniao(String linkReuniao) {
		this.linkReuniao = linkReuniao;
	}
	
	// realiza o agendamento de uma consulta entre um psicólogo e um paciente, definindo data e hora para consulta
	// e retorna uma mensagem com essas informações
	public String marcar(String data, String hora) {
		this.data = data;
		this.hora = hora;
		return "Ok! Sua primeira consulta foi pré agendada para o dia " + this.data + ", às " + this.hora + " horas";

	}
	
	public String desconto(String cupom) {
		ArrayList<String> cupons = new ArrayList<String>(Arrays.asList("10OFF", "BLACKFRIDAY", "DESCONTO"));
		if(cupons.contains(cupom)) {
			this.psi.setValorConsulta(this.psi.getValorConsulta()*0.9);
			return "O novo preço para a consulta é de " + this.psi.getValorConsulta() + " reais";
		}
		else {
			return "Cupom incorreto ou indisponível no momento...";
		}
	}
}
