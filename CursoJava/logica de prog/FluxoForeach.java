import java.util.ArrayList;

public class FluxoForeach {
	public static void main(String[] args) {
		int[] pares = { 2, 4, 6, 8 };

		for (int i=0; i< pares.length; i++) {
			int par = pares[i];

			System.out.print(par);
			
		}
		System.out.println("");
		

		for (int a : pares) {
			System.out.println(a);
		}

		/** ******************* */
		/**	foreach	**/
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);

		}
		for (Integer numero : list) {
			System.out.print(numero);
		}

	}
}