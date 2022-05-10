package poo;

public class Carro {
	
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	
	public Carro() {							//construtor serve para inicializar o objeto "as variaveis que existem dentro do objeto"
		
	}
	
	public Carro(String modelo,	int velocidadeMaxima, double segundosZeroACem) {
		 this(modelo, velocidadeMaxima, segundosZeroACem, null);  //this faz referencia a esse objeto
		
	}
	
	 public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		 this.modelo = modelo;
		 this.velocidadeMaxima = velocidadeMaxima;
		 this.segundosZeroACem = segundosZeroACem;
		 this.motor = motor;
	 }

}
