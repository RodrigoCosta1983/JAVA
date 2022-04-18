package poo;

public class CachorroTestI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro pitbull = new Cachorro();
		pitbull.raca = "PIT BULL";
		pitbull.tamanho = 40;
		
		pitbull.latir();
		
		Cachorro viralata = new Cachorro();
		viralata.raca = "Vira Lata";
		viralata.tamanho = 25;
		
		viralata.latir();
	}

}
