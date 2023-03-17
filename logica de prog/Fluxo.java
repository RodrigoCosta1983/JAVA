public class Fluxo {
	public static void main(String[] args) {

		char sexo = 'M';

		switch (sexo) {

		case 'M':
			System.out.println("Masculino");
			break;

		case 'F':
			System.out.println("Feminino");
			break;

		default:
			System.out.println("Outro");

		}

		String tecnologia = "postgresql";

		switch (tecnologia) {
		case "java":
		case "c++":
		case "cobol":
			System.out.println("Linguagem de Programacao");

			break;

		case "oracle":
		case "sqlserver":
		case "postgresql":
			System.out.println("Banco de Dados");

			break;

		default:
			System.out.println("Tecnologia Desconhecida");

			break;
		}

	}
}
