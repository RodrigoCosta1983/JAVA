import java.util.Scanner;

public class entrada {
    public static void main(String[] args){
        // Chamada do Programa
        //  System.out.println(args[0]);

        //Interagindo com Usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu nome");
        String nome = s.nextLine();
        System.out.println("Bem vindo " + nome);
    }
}
