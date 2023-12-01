package Funcionalidades;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Testes {

	// Classe Main para teste do instanciamento dos objetos e utilização dos métodos
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String choice, dataConsulta, horaConsulta, choiceDesconto;
		
		System.out.println("Teste da Classe Usuário: ");
		System.out.println("Você irá cadastrar um paciente e um psicólogo para os testes a seguir: ");
		
		// Usuário entra com os dados de um paciente
		System.out.println("Cadastro de paciente:");
		Paciente p = new Paciente();
		p.setIdUser(1);
		System.out.println("Nome do paciente:");
		p.setNome(read.nextLine());
		System.out.println("Email do paciente:");
		p.setEmail(read.nextLine());
		System.out.println("telefone do paciente:");
		p.setTelefone(read.nextLine());
		System.out.println("Cidade do paciente:");
		p.setCidade(read.nextLine());
		System.out.println("Sexo do paciente:");
		p.setSexo(read.nextLine());
		System.out.println("Plano de saúde do paciente:");
		p.setPlanoSaude(read.nextLine());
		
		// exibe os dados do paciente
		// mostra atributos do objeto p no console. "total" imprime todas informações e "simples" imprime somente id e nome
		p.show("total");
		// p.show("simples");
		
		// Cadastro de Psicõlogo
		System.out.println("Cadastro de psicólogo:");
		Psicologo psi = new Psicologo();
		psi.setIdUser(2);
		
		System.out.println("Nome do psicólogo:");
		psi.setNome(read.nextLine());
		System.out.println("Email do psicólogo:");
		psi.setEmail(read.nextLine());
		System.out.println("telefone do psicólogo:");
		psi.setTelefone(read.nextLine());
		System.out.println("Cidade do psicólogo:");
		psi.setCidade(read.nextLine());
		System.out.println("Sexo do psicólogo:");
		psi.setSexo(read.nextLine());
		
		System.out.println("CRP do psicólogo:");
		psi.setCRPPsicologo(read.nextLine());
		System.out.println("Valor da consulta para o psicólogo:");
		psi.setValorConsulta(read.nextDouble());
		read.nextLine();
		System.out.println("Formação do psicólogo:");
		psi.setFormacao(read.nextLine());
		System.out.println("Disponibilidade do psicólogo:");
		psi.setDisponibilidade(read.nextLine());
		
		// Cadastra duas especialidades quaisquer (sem input do usuário por simplificação) e atribui ao psicólogo
		ArrayList<Especialidade> especialidades = new ArrayList<Especialidade>();
		
		Especialidade esp1 = new Especialidade();
		esp1.setId(1);
		esp1.setNome("Psicanálise");
		Especialidade esp2 = new Especialidade();
		esp2.setId(2);
		esp2.setNome("TCC");
		especialidades.add(esp1);
		especialidades.add(esp2);
		psi.setEspecialidades(especialidades);
		
		// mostra atributos do objeto psi no console. "total" imprime todas informações e "simples" imprime somente id e nome
		psi.show("total");
		//psi.show("simples");
		
		// Inicia sessão para o usuário paciente p
		Sessao s = new Sessao();
		s.setId(1);
		s.setUser(p);
		System.out.println(s.start(LocalDateTime.now()));
		
		// Realiza match entre paciente e psicólogo
		psi.show("parcial");
		System.out.println("Você gostaria de realizar uma combinação com o psicólogo a seguir? [S/N]");
		
		choice = read.nextLine();
		if(choice.toUpperCase().equals("S")){
			Match match = new Match();
			match.setP(p);
			match.setPsi(psi);
			match.combina();
			// Em caso de match, realiza agendamento para primeira consulta
			System.out.println("Facilitador de agendamento");
			Agendamento agen = new Agendamento();
			agen.setP(p);
			agen.setPsi(psi);
			System.out.println("Disponibilidade do psicólogo: " + psi.getDisponibilidade());
			System.out.println("Escolha uma data para a sua primeira consulta");
			System.out.println("Data: ");
			dataConsulta = read.nextLine();
			System.out.println("Hora: ");
			horaConsulta = read.nextLine();
			System.out.println(agen.marcar(dataConsulta, horaConsulta));
			System.out.println("Gostaria de usar um cupom de desconto: [S/N] (Cupom 10OFF disponível!)");
			choiceDesconto = read.nextLine();
			if(choiceDesconto.toUpperCase().equals("S")) {
				System.out.println("Digite o código do cupom: ");
				System.out.println(agen.desconto(read.nextLine()));
			}
			else {
				System.out.println("Nenhum cupom de desconto será aplicado");
			}
		}
		else System.out.printf("Combinação não realizada");
		
		System.out.println(s.end(LocalDateTime.now()));
		read.close();
		
		System.out.println("Fim dos testes! Programa finalizado.");
	}
}
