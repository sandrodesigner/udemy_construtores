
package entities;

public class Produto {
	
	private String name;
	private double price;
	private int quantity;
    
	//CONSTRUTOR padrão...
	public Produto() {
		
		
	}
	//CONTRUTOR - ele obriga o OBJETO já iniciar
	// com valores
	public Produto(String nome,double preco,int quantidade) {
		
		this.name = nome;
		this.price = preco;
		this.quantity = quantidade;
	}
	//OVERRYDE..
	//SOBRECARGA - é fazer mais de um CONTRUTOR com mais de uma
	//versão 
    //CONSTRUTOR JÁ INICIANDO COM VALOR ESPECIFICADO (quantity)
	public Produto(String nome, double preco) {

		this.name = nome;
		this.price = preco;
		quantity = 1;
	}
    
	//ENCAPSULAMENTO..restrição de acesso
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//quantidade só tem o método GET
	//pq a quantidade é alterada no método add e remove. 
	public int getQuantity() {
		return quantity;
	}
    // MÉTODOS..
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}