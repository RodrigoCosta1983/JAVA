package javaPoo;

public class ClienteApp {

	public static void main(String[] args) {
		/// TODO Auto-generated method stub

		ClientePF clientepf1 = new ClientePF("Rodrigo", "Bairro: Xerem", "12134");
		ClientePJ clientepj1 = new ClientePJ("Sophie", "Bairro: Penha", "5432");

		System.out.println("Cliente PF1 " + clientepf1.getNome());
		System.out.println("Cliente Pj1 " + clientepj1.getNome());
		System.out.println("Cliente PF1 " + clientepf1.getNome() + " " + clientepf1.getEnd());
		System.out.println("Cliente PJ1 " + clientepj1.getNome()+" " + clientepj1.getEnd());
	}

}
