

package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com produto: ");
		System.out.print("Nome: ");
		
		String name = sc.nextLine();
		System.out.print("Preço: ");
		
		double price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		
		int quantity = sc.nextInt();
		System.out.println();
		
		//overryde segundo construtor
		Produto produto = new Produto(name, price,quantity);
		
		//terceiro construtor
		//Produto produto = new Produto(name, price);
		
		
		//Acessando valores do atributos através
		//dos métodos GET E SET
		produto.setName("COMPUTADOR GAMER");
		System.out.println("Update de produto " + produto.getName());
		
		produto.setPrice(1000);
		System.out.println("Updatre de preco com get " + produto.getPrice());
		
		System.out.println("Produto data: " + produto);
		System.out.println();
		
		System.out.print("Entre com numero de produtos para adicionar ao estoque: ");
		quantity = sc.nextInt();
		produto.addProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + produto);
		System.out.println();
		
		System.out.print("Entre com numero de produtos para remover do estoque: ");
		quantity = sc.nextInt();
		
		produto.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		sc.close();
	}
}
