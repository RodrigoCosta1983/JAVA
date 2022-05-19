package heranca;

public class OperacaoMatMain {

	public static void calcule(OperacaMatematica o, double X, double Y) {
		
		System.out.println(o.calcular(X, Y));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);
	}

}
