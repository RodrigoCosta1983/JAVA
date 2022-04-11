import javax.swing.JOptionPane;

public class EntradaJo {
    public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog("Qual o seu nome?");   //Abre em uma caixa de dialogo

     // System.out.println(nome);
      JOptionPane.showMessageDialog(null, nome);   // Imprime em outra janela

    }
}
