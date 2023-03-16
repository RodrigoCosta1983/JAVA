 public class Operador {
	public static void main(String[] args) {

		int x = 6;

		System.out.println(x != 6);
		System.out.println(!(x != 6)); // estou negando a condiçao interna

		int idade = 20 ;

		String y = (idade >= 18) ? "Maior de idade" : "Menor de idade";

		System.out.println(y);

	}

}
 