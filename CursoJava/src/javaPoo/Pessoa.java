package javaPoo;

public class Pessoa {

	private int codigo;
	private String nome;

	public Pessoa(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
		
	}

}
