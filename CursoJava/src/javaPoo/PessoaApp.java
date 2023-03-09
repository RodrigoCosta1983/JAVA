package javaPoo;

public class PessoaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa(1, "Sophie");
		Pessoa pessoa2 = new Pessoa(2, "Hellen");
		Pessoa pessoa3 = new Pessoa(3, "Rod");
		
		System.out.println("O meu nome eh: "+pessoa1.getNome());
		System.out.println("O meu nome eh: "+pessoa2.getNome());
		System.out.println("O meu nome eh: "+pessoa3.getNome());

	}

}
