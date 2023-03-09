package javaPoo;

public class ClientePF extends Cliente {
	private String cpf;

	public ClientePF(String nome, String end, String cpf) {
		super(nome, end);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCnpj(String cpf) {
		this.cpf = cpf;
	}
}
