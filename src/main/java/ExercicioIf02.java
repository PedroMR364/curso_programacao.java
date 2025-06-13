import java.util.Scanner;

public class ExercicioIf02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int parImpar;

        System.out.println("Digite um Número: ");
        parImpar = sc.nextInt();

        if (parImpar % 2 == 0) {
            System.out.println("Seu número é PAR!");
        } else {
            System.out.println("Seu número é ÍMPAR!");
        }
        sc.close();

    }
}
