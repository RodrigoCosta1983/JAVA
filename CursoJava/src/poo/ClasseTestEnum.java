package poo;


public class ClasseTestEnum {
					
		EnumPlanetas planeta;

	ClasseTestEnum(String planeta) {
		this.planeta = EnumPlanetas.valueOf(planeta);
	}

	public void viajarPlaneta() {
		
		switch (planeta) {
			case MERCURIO:
				System.out.println("Muito quente por la");
				break;
				
			case TERRA:
				System.out.println("Ja estamos aqui");
				break;
					
			case URANO:
				System.out.println("Muito longe");
				break;

			default:
				System.out.println("Passagem esgotadas");
				break;
			}
		}
	

	
}
