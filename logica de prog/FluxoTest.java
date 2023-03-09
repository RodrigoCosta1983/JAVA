import java.util.ArrayList;
import java.util.Scanner;

public class FluxoTest {
	public static void main(String[] args) {
		ArrayList<String> produtos = new ArrayList<String>(); // Aonde esta alocados todos os produtos do usuario
		Scanner s = new Scanner(System.in); // Ler os dados digitados pelo usuario

		// System.out.println("P = " + s);

		System.out.println("Liste os seu produtos : Para sair digite FIM");

		String produto;

		while (!"FIM".equals(produto = s.nextLine())) { // .esquals eh um metodo de comparacao
			produtos.add(produto);
		}
		System.out.println(produtos.toString()); // toString imprime todos os produtos da lista
	}
}
