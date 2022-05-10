package poo;

import java.util.Scanner;

public class EnumsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(EnumPlanetas p : EnumPlanetas.values()) {
			System.out.printf("%s%n", p);
		}
		
		Scanner entrada = new Scanner(System.in); 
			String planeta;
			System.out.println("Para qual planeta quer viajar?");
			planeta = entrada.next().toUpperCase();
			entrada.close();
		
		
			ClasseTestEnum p1 = new ClasseTestEnum(planeta);
			p1.viajarPlaneta();
	
		
	}
}
