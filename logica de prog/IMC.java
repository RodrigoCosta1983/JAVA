import javax.swing.JOptionPane;

/**
 * Calcular o IMC IMC = pesoEmQuilogramas / (altura * altura)
 */

public class IMC {

	public static void main(String[] args) {

		String peso = JOptionPane.showInputDialog("Qual o seu peso em KG ?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura em CM ?");

		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);

		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do Peso Ideal ";

		msg = "IMC = " + imc + "\n" + msg;

		// System.out.println("Vc esta com " + msg );
		JOptionPane.showMessageDialog(null, msg); // Imprimir a resposta

	}
}
