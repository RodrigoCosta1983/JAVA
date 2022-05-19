package heranca;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro toto = new Cachorro();
		toto.comida = "carne";
		toto.peso = 5;
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.comida = "algo";
		carijo.dormir();
		
		
		System.out.println(toto instanceof Cachorro);  //saber se o objeto pertence a essa classe
		System.out.println(toto instanceof Animal);		
		
		toto.equals(carijo);
		toto.hashCode();
		toto.getClass();
		
		
		toto.fazerBarulho();
		carijo.fazerBarulho();
		
	}

}
