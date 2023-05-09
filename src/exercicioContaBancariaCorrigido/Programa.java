package exercicioContaBancariaCorrigido;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
        // nesse main a Classe Conta foi instancia de
		//uma forma diferente com sobrecarga dentro do if
		// e as variáveis do objetos não foi criada
		
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("DIGITE O NOME DO CLIENTE: ");
		String nome = sc.next();
		
		
		System.out.print("DIGITE O NUMERO DA CONTA: ");
		sc.nextLine();
		int numeroConta = sc.nextInt();
		
		
		System.out.print("Vc quer realizar um deposito? SIM ou NÃO ");
		
		
		String resposta = sc.next();
		
		if( resposta == "SIM") {
			
			System.out.println("Digite o valor do depósitpo: ");
			
			double depositoInicial = sc.nextDouble();
			// sobrecarga de construtores
			// não chama os dados do construtor corretamente / - {resposta}?
			conta  = new Conta(numeroConta, resposta, depositoInicial);
			
		}else {
			
			conta  = new Conta(numeroConta, resposta);
		}
			
			
		
		System.out.println();
		System.out.println("Atualização da Conta :");
		System.out.println(conta);
		System.out.println();
		System.out.println("________________________");
		
		// ***testando depósito
		System.out.print("Entre com valor do depósito:");
		double valorDeposito = sc.nextDouble();
		
		conta.deposito(valorDeposito);
		System.out.print("Atualização da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("________________________");
		
		// ***testando saque
		System.out.println("Quanto vc sedeja sacar?");
		double valorSaque = sc.nextDouble();
		
		conta.saque(valorSaque);
		System.out.print("Atualização da conta:");
		System.out.println(conta);
		
		sc.close();
	}

	
}
