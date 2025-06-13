
import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int diferenca1 = A * B;
        int diferenca2 = C * D;
        int resultado = diferenca1 - diferenca2;
        
        System.out.printf("DIFERENÇA: %d%n", resultado);
        
        sc.close();
    }
    
}
