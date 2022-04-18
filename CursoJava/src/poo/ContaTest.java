package poo;

public class ContaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		conta.cliente = "Ricardo";
		conta.saldo = 10_000.00;  		//double pode utilizar ". ou _" nos numeros
		conta.exibeSaldo();
		
		
		conta.sacar(1000);
		conta.exibeSaldo();
		
		
		conta.deposita(6000);
		conta.exibeSaldo();
		
		
		Conta destino = new Conta();
		destino.cliente = "Allan";
		destino.saldo = 8_000.00;
		destino.exibeSaldo();
		
		conta.transfPara(destino, 2500);
		conta.exibeSaldo();
		destino.exibeSaldo();
		
		
	}

}
