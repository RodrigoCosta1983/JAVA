package poo;

public class MatConversTipo {
	double media(int x, int y) {
		System.out.print("Media(int x, int y) ");
		return (x+y)/2;
	}
	
	double media(String x, String y) {
		System.out.print("Media(int x, int y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		
		return(ix + iy) / 2;
	}
	
	double media(int ...numeros ) {
		System.out.println("media(int ...is numeros) ");
		return 0 ;
	}

}
