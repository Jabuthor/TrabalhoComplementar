package br.univel.meustestes;

import java.math.BigDecimal;

import br.univel.minhaarvore.UniArvore;
import br.univel.minhaarvore.UniArvoreImpl;
import br.univel.minhaarvore.UniNode;
import br.univel.minhaarvore.UniNodeImpl;

public class Principal {
	
	public Principal(){
		
		UniArvore<Conta> planoContas = new UniArvoreImpl();
	
		Conta contaAgua = new Conta(1,"Agua",new BigDecimal("101,28"));
		UniNode<Conta> noAgua = new UniNodeImpl<>(contaAgua);
		
		Conta contaAluguel = new Conta(2,"Aluguel",new BigDecimal("859,56"));
		UniNode<Conta> noAluguel = new UniNodeImpl<>(contaAluguel);
		
		Conta contaIntTel = new Conta(3,"Internet e telefone",new BigDecimal("421,21"));
		UniNode<Conta> noIntTel = new UniNodeImpl<>(contaIntTel);
		
		Conta contaEnElet = new Conta(4,"Energia elétrica",new BigDecimal("582,14"));
		UniNode<Conta> noEnElet = new UniNodeImpl<>(contaEnElet);

		Conta despesasAdm = new Conta(1,"Despesas Administrativas",new BigDecimal(0));
		UniNode<Conta> noDeAdm = new UniNodeImpl<>(despesasAdm);
		noDeAdm.addFilho(noAgua);
		noDeAdm.addFilho(noAluguel);
		noDeAdm.addFilho(noIntTel);
		noDeAdm.addFilho(noEnElet);
		
		Conta despesasOper = new Conta(1,"Despesas Operacionais", new BigDecimal(0));
		UniNode<Conta> noDeOpr = new UniNodeImpl<>(despesasOper);
		noDeOpr.addFilho(noDeAdm);
		
		/** contas
		 * 
		 */
		
		somarFilhos(planoContas);
		
		/** Mostra todo o plano de contas, inclusive com
		 * tabulações (\t) a cada nivel.
		 */
		planoContas.mostrarTodosConsole();
		
		//O exercicio consiste em identificar a necessidade de
		//novos métodos para finalizar a tarefa, sempre lembrando
		//de coesão, acoplamento e encapsulamento.
		//Entrega link do repositorio para fernandod@univel.br com assunto:
		//TrabalhoComplementar 3o Sem
		
	}
	
	/**Percorre toda a arvore, recursivamente, encontra
	 * todas as contas analiticas (isLeaf() == true), soma
	 * seus valores e atribui o total na conta pai.
	 * 
	 * Depois pega todos os pais e somam no avô.
	 * 
	 * @param planoContas
	 */
	private void somarFilhos(UniArvore<Conta> planoContas) {
		
	}
	public static void main(String[] args) {

		new Principal();
		
	}

}
