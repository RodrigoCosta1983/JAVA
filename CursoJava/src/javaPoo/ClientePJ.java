package javaPoo;

public class ClientePJ extends Cliente {
	private String cnpj;

	public ClientePJ(String nome, String end, String cnpj) {
		super(nome, end);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
