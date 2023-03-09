import java.util.Arrays;

public class ArraySimples {
	public static void main(String[] args) {

		String[] paises = { "BR", "RS", "ES", "PT", "PG" };

		System.out.println(paises[0]);

		paises[0] = "BRASIL";

		System.out.println(paises[0]);
		System.out.println(paises.length);

		System.out.println(Arrays.toString(paises));

		int posicao = Arrays.binarySearch(paises, "ES");

		System.out.println(posicao);

		Arrays.sort(paises, 0, paises.length); // imprimindo a lista completa

		System.out.println(Arrays.toString(paises)); // imprimindo em Lista ordenada

		Double[] valores = { 12.34, 2341.1233 };
		System.out.println(valores[0].doubleValue()); // imrprimindo direto na Array

	}
}
