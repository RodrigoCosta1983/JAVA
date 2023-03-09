package javaPoo;

public class PessoaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa1 = new Pessoa(1, "Sophie");
		Pessoa pessoa2 = new Pessoa(2, "ellen");

		Pessoa codPessoa1 = new Pessoa(1, null);

		System.out.println("O meu nome eh: " + pessoa1.getNome());
		System.out.println("O meu nome eh: " + pessoa2.getNome());
		System.out.println("O meu cod eh: " + codPessoa1.getCodigo());

		System.out.println("Cod: " + codPessoa1.getCodigo() + " - Nome: " + pessoa1.getNome());

		pessoa1.setNome("Hellen");

		System.out.println("Nome alterado: " + pessoa1.getNome());
	}

}