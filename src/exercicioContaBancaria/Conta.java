package exercicioContaBancaria;

public class Conta {

	int numeroConta;
	double saldo;
	Cliente titular;
	
	public void deposito(double valor){
		
		this.saldo += valor;
	}
	public boolean saque(double valor) {
		
		if(this.saldo < valor) {
			
			 this.saldo -= valor;
		}
		return false;
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
