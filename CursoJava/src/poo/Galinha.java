package poo;

public class Galinha {
	
	public static int ovosDaGranja; //variavel global
		
	
	
	public int ovos; // total de ovos do OBJETO galinha
	
	public Galinha botar() {		// utilizando o metodo GALINHA e nao VOID para ter o return no metodo
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
		
	}

	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}
}
