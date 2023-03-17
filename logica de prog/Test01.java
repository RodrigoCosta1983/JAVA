import java.util.Random;
import java.util.Scanner;

public class Test01 {
	//private static Scanner s;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu palpite nos dados? Entre 1 e 6.");
		int palpite = s.nextInt();
		System.out.println("Seu Palpite eh: " + palpite);

		// int p2 = Integer.parseInt(palpite);

		if (palpite >= 1 && palpite <= 6) {

			//	String[] dado = { "1", "2", "3", "4", "5", "6" };
			Random r = new Random();
			int dado = r.nextInt(6)+1;
			
			/**			
			Integer valorDado = r.nextInt(dado.length);
			String valoDadoSortiado = dado[valorDado];
			System.out.println("O valor sortiado foi = " + valoDadoSortiado);
			boolean b = Boolean.getBoolean(valoDadoSortiado);
			Boolean.getBoolean(palpite);
			
			**/
			
			System.out.println("O valor sortiado foi = " + dado);

			if (palpite == dado) {
				System.out.println("Vc acertou !!!");

			} else {
				System.out.println("Tente novamente !!!");
			}

		}

		else {
			System.out.println("Digite um valor entre 1 e 6 !!!!");
		}

	}
}
