package poo;

public class FuncionarioPacote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f = new Funcionario();
		f.nome = "RODRIGO COSTA DA SILVA";
		
		
		System.out.println(f.nome);
		System.out.print(f.nome.charAt(0));
		System.out.println(f.nome.charAt(1));
		System.out.println(f.nome.length());
	}

}
