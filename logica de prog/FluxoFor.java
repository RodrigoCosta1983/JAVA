import java.util.Iterator;

public class FluxoFor {

	public static void main(String[] args) {
		int tamanho = 5;

		for (int i = 0; i < tamanho; i++) {

			// System.out.println("for ");
			//System.out.print("for ");

		}
		
		for(int x=0; x<tamanho; x++) {
			for(int i=0; i<tamanho; i++) {
				System.out.print("* ");			
			}
			System.out.println();
		}
		
	}
}