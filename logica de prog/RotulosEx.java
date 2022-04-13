public class RotulosEx {
    public static void main(String[] args) {


        boolean [][] matrix =           /** Chamamos essa matrix de A */
        {
            {false, true, false, false, false},  /** Chamamos essa matrix de B */
            {false, false, false, false, false}     /** Chamamos essa matrix de B */
        };
        busca:
        for (int a = 0; a < matrix.length; a++) {
            
            System.out.print("A ");

            for (int b = 0; b < matrix[a].length; b++) {
                
                if(matrix[a][b]){
                    System.out.println("true");
                    break busca;
                }
                System.out.print("B ");
            }
        }
    }
}
