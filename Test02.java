import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu palpite nos dados?");
        int palpite = s.nextInt();
        System.out.println("Seu Palpite eh: " + palpite);

        if (palpite < 1 || palpite > 6) {
            System.out.println("Digite um valor entre 1 e 6");
        }else{
            Random n = new Random();
        int dado = n.nextInt(6) + 1;

        System.out.println("O valor sortiado foi = " + dado);

        if (palpite == dado) {
            System.out.println("Parabens vc acertou !!!");
            
        }else{
            System.out.println("Tente novamente");
        }
        }

        
    }
}
