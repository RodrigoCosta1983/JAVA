import java.util.Random;
import java.util.Scanner;

public class Test01 {
    private static Scanner s;
	public static void main(String[] args) {

            s = new Scanner(System.in);
            System.out.println("Qual o seu palpite nos dados?");
            String palpite = s.nextLine();
            System.out.println("Seu Palpite eh: " + palpite);

            int p2 = Integer.parseInt(palpite);
            
            if (p2 >= 1 && p2 <=6 ) {

            String[] dado = {"1","2","3","4","5","6"};
           Random r = new Random();

           Integer valorDado = r.nextInt(dado.length);
           String valoDadoSortiado = dado[valorDado];
            
           System.out.println("O valor sortiado foi = " + valoDadoSortiado);

           boolean b = Boolean.getBoolean(valoDadoSortiado);
           Boolean.getBoolean(palpite);


            if (b) {
                System.out.println("Vc acertou !!!");
                
            }else{
                System.out.println("Tente novamente !!!");
            }

                
            }

           else{
            System.out.println("Digite um valor entre 1 e 6 !!!!");
           }
            
        
    }
}
