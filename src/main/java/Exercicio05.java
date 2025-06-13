
import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cdp1 = sc.nextInt(); //código da peça
        int qdp1 = sc.nextInt(); //quantidade de peças
        double vdp1 = sc.nextDouble(); //valor da peça
        
        int cdp2 = sc.nextInt(); //código da peça
        int qdp2 = sc.nextInt(); //quantidade de peças
        double vdp2 = sc.nextDouble(); //valor da peça
        
        double soma1 = vdp1 * qdp1;
        double soma2 = vdp2 * qdp2;
        double resultado = soma1 + soma2;
        
        System.out.printf("VALOR A PAGAR: %.2f R$%n", resultado);
        
        
        sc.close();
    
    
    }
    
}