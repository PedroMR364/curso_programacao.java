
import java.util.Locale;

public class DesafioDeFixacao {
    
    public static void main(String[] args) {
        
        String produto1 = "Computador";
        String produto2 = "Office Desk";
        
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        
        System.out.printf("Produtos:%n %s, O preço é $%.2f%n %s, O preço é $%.2f%n", produto1, preco1, produto2, preco2);
        System.out.printf("%nRegistro:%n %d anos, codigo %d e genero %c%n", idade, codigo, genero);
        System.out.printf("%nMeça com oito casas decimais: %.8f%n", medida);
        System.out.printf("Arredondado: %.3f%n", medida);
        System.out.printf(Locale.US, "Ponto decimal dos EUA: %.3f%n", medida);
    }
    
}
