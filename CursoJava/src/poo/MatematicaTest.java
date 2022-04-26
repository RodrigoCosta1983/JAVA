package poo;
/**
 * 
 * @author rodri
 *
 */
public class MatematicaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matematica m = new Matematica();
		int ma = m.maior(10, 20);
		System.out.println(ma);
		
		
		double so = m.soma(10, 20);
		System.out.println(so);
		
		
		int par = m.maior(2, 4);
		int impar = m.maior(3, 5);
		
		double so1 = m.soma(par, impar);
		
		// double so = m.soma(m.maior(2, 4), m.maior(3, 5)); seria a mesma coisa 
		
		System.out.println(so1);
	}

}
