package poo;

public class Galinha {
	
	public int ovos; // total de ovos do OBJETO galinha
	
	public Galinha botar() {		// utilizando o metodo GALINHA e nao VOID para ter o return no metodo
		this.ovos++;
		return this;
		
	}

}
