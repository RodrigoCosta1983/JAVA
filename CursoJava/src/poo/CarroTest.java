package poo;

public class CarroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro ferrari = new Carro();   //"Carro" > construtores comecam com letras maiusculas igual a das classes e possuem o mesmo nome do tipo da classe
		ferrari.modelo = "Ferrari Punto";
		ferrari.velocidadeMaxima = 200;
		ferrari.segundosZeroACem = 5.5;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		
		ferrari.motor = v12;  // essa linha add o motor ao carro
		
		
		Carro corola = new Carro("Corola XLS", 350, 3.2);
		Motor v8 = new Motor("V8", 1018);
		corola.motor = v8;
		
		Carro civic = new Carro("New Civic", 280, 4.3, new Motor("XLS16", 1200));
		
		System.out.println(civic.modelo + " " + civic.motor.tipo +" "+  civic.motor.potencia);
		
		System.out.println(corola.modelo);
		
		//OU assim
		
		System.out.println("Modelo: " + corola.modelo + " sua velocidade maxima eh: " + corola.velocidadeMaxima + " faz de 0 a 100 em: " + corola.segundosZeroACem);
		
		System.out.println(corola.motor.potencia);
	
	}

}
