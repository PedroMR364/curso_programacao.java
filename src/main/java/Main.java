
import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        
        double x = 10.35784;
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e recebe %.2f reais%n", nome, idade, renda);
    }
    
}
