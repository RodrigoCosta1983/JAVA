package poo;

public class ArgumentoVariaveis {

	int maior(int um, int dois) {
		if (um > dois) {
			return um;

		} else {
			return dois;
		}

	}

	double soma(String titulo, double... numeros) {
		System.out.println(titulo);
		double total = 0;
		for (double n : numeros) {
			total += n;
		}

		return total;
	}
}
