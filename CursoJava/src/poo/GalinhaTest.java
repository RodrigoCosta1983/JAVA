 package poo;

public class GalinhaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Galinha g1 = new Galinha();
		g1.botar().botar().botar().botar(); // na mesma linha utilizando o metodo GALINHA
		
		
		Galinha g2 = new Galinha();
		g2.botar();							// ou separado por linhas
		g2.botar();
		
		Galinha Eva = new Galinha();
		Eva.botar().botar().botar();
		
		System.out.println(g1.ovos);
		System.out.println(g2.ovos);
		System.out.println("Eva colocou: "+ Eva.ovos +" ovos");
		System.out.println("Total de ovos da granja: " + Galinha.ovosDaGranja);
		System.out.println(Galinha.mediaDeOvos(3));
	}

}
