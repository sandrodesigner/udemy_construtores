package exercicioContaBancaria;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
    
		Cliente cli1 = new Cliente();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE O NOME DO CLIENTE:");
		cli1.nome = sc.next();
		System.out.println("BEM-VINDO " + cli1.getNome());
		
		Conta c = new Conta();
		System.out.println("DIGITE O NUMERO DA CONTA");
		c.numeroConta = sc.nextInt();
		System.out.println("Numero da conta " + c.getNumeroConta());
		
		System.out.println("Vc quer realizar um deposito? SIM ou NÃO ");
		
		
		String resposta = sc.next();
		
		if( resposta == "SIM") {
			c.deposito(200);
		}else {
			
			System.out.println("Não foi realizado DEPÓSITO!");
		}
		
		
		System.out.println(cli1.nome + " Seu depósito foi de " + c.saldo);
		
		c.saque(101);
		
		System.out.println(cli1.nome + " Seu saque foi de " + c.saldo);
	}

	
}
