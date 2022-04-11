public class FluxoTest2 {
    public static void main(String[] args) {
        
        
        int x = 1;  //anterior
        int y = 2;  //proximo
        
        System.out.println(x);
       
        while (y < 50) {

            System.out.println(y);

           y = y + x;
           x = y + x;


            
        }
        
    }
}
