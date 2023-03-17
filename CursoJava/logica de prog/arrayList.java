 import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<>();

		cores.add("Branco");
		cores.add(0, "Preto");
		cores.add("Verde");
		cores.add(1, "Azul");
		
		
		System.out.println(cores.size());  //Imprimir Qts elementos existe na Array

		System.out.println(cores.toString());

		System.out.println("Tamanho = " + cores.get(2));
		System.out.println(cores.get(2));
		System.out.println("Indice Branco = " + cores.indexOf("Branco")); //retorna a posiçao na Array

		System.out.println("Tem Branco? " + cores.contains("Branco"));

		cores.remove("Branco");

		System.out.println(cores.toString());

		System.out.println("Tem Branco? " + cores.contains("Branco"));
		
		System.out.println("Possui " + cores.size() + " elementos atual");  //Imprimir Qts elementos existe na Array
		

	}
}
