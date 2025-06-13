
import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //numero de identificação
        double ht = sc.nextDouble(); //horas trabalhadas
        double vrh = sc.nextDouble(); //valor recebido por hora
        double resultado = (ht * vrh) * 30;
        
        System.out.printf("NÚMERO: %d%nSALÁRIO: %.2f R$%n", n, resultado);
        
        sc.close();
    
    
    }
    
}
