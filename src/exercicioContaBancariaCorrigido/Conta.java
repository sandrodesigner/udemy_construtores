package exercicioContaBancariaCorrigido;

public class Conta{

	private int numeroConta;
	private double saldo;
	private String titular;
	
	//construtores..
	public Conta(int numeroConta, String titular) {
		
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public Conta(int numeroConta,String titular,double depositoInicial) {
		
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(depositoInicial);
	}
    //métodos..
	public void deposito(double qtd){
		
		this.saldo += qtd;
	}
	
	public boolean saque(double qtd) {
		
		if(this.saldo < qtd) {
			
			 this.saldo -= qtd + 5.0;
		}
		return false;
		
	}
	//regras de negócio
    //set de numeroConta não foi criado
	// pq não pode ser modificado
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String toString() {
		
		return "Conta "
			   + numeroConta
			   + ", Cliente: "
			   + titular
			   + ",Saldo: R$ "
			   + String.format("%.2f", saldo);
	}
	
	
}
