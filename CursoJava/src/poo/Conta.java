package poo;

public class Conta {
	
	String cliente;
	double saldo;
	
	
	void exibeSaldo() {
		System.out.println(cliente + " seu saldo eh " + saldo);	
	}
	
	void sacar(double valor) {
		
		saldo -= valor;  		// seria a mesma coisa assim >>> saldo = saldo - valor;
	}
	
	void deposita(double valor) {
		saldo += valor;
	}
	
	void transfPara(Conta destino, double valor) {
		this.sacar(valor);
		destino.deposita(valor);
	}
}
