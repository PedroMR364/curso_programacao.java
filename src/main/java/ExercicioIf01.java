import java.util.Scanner;

public class ExercicioIf01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Qual é o número?");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Seu número é NEGATIVO!!!");
        } else {
            System.out.println("Seu número é POSITIVO!!!");
        }
        sc.close();
    }
}
