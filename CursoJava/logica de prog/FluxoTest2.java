public class FluxoTest2 {
	public static void main(String[] args) {

		int x = 0; // anterior
		int y = 1; // proximo

		System.out.println(x);

		while (y < 50) {

			System.out.println(y);

			y = y + x;
			x = y - x;

			// break; //Paro a execucao do LOOP

		}

	}
}
