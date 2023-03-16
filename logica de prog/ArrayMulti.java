import java.util.Random;

public class ArrayMulti {
	public static void main(String[] args) {

		/** Array Duas Dimensoes  
		 * String [][] duas = { {"Ricardo", "M", "RJ"}, {"Sophie", "F", "SP"} };
		 * 
		 * System.out.println(duas[0][0]); Arrays.sort(duas[0], 0, duas.length);
		 * System.out.println(duas[0].length);
		 * 
		 */

		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Reis" };
		String[] nipes = { "Espadas", "Paus", "Copas", "Ouros" };

		Random r = new Random();
		// System.out.println(r.nextInt(10));

		/**
		 * Faces aleatorias
		 */
		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];

		/**
		 * nipes aleatorios
		 */
		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];

		// System.out.println(face);

		String carta = face + " " + nipe;
		System.out.println(carta);

	}
}
