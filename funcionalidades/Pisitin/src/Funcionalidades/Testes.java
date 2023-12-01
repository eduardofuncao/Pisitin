package Funcionalidades;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Testes {

	// Classe Main para teste do instanciamento dos objetos e utilização dos métodos
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		LocalDateTime a = LocalDateTime.now();
		LocalDateTime b = LocalDateTime.now();
		
		
		
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
		p.show("simples");
		
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
		System.out.println("Especialidade do psicólogo:");
		psi.setEspecialidade(read.nextLine());
		System.out.println("Valor da consulta para o psicólogo:");
		psi.setValorConsulta(read.nextLine());
		System.out.println("Formação do psicólogo:");
		psi.setFormacao(read.nextLine());
		System.out.println("Disponibilidade do psicólogo:");
		psi.setDisponibilidade(read.nextLine());
		
		// mostra atributos do objeto psi no console. "total" imprime todas informações e "simples" imprime somente id e nome
		psi.show("total");
		psi.show("simples");
		
		// Inicia sessão para o usuário paciente p
		Sessao s = new Sessao();
		s.setId(1);
		s.setUser(p);
		System.out.println(s.start(LocalDateTime.now()));
		read.next();
		System.out.println(s.end(LocalDateTime.now()));
		read.close();
	}
}
