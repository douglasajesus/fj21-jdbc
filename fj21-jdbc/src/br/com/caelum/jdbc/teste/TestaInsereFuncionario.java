package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;

public class TestaInsereFuncionario {

	
	public static void main (String [] args){
		
		//pronto para gravar
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jesus");
		funcionario.setUsuario("jesus@caelum.com.br");
		funcionario.setSenha("1234567");
		 
		//grave nessa conexão
		FuncionarioDao dao = new FuncionarioDao();
		
		//método elegante
		dao.adiciona(funcionario);
		
		System.out.println("Gravado Funcionário!");
	}
}
