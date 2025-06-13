import java.util.Scanner;

public class ExercicioIf04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hij;
        int hfj;
        int ddj;

        System.out.println("Qual foi a hora inicial do Jogo?: ");
        hij = sc.nextInt();
        System.out.println("Qual foi a hora final do Jogo?: ");
        hfj = sc.nextInt();

        if (hij < hfj) {
            ddj = hfj - hij;
        } else {
            ddj = 24 - hij + hfj;
        }

        System.out.printf("A duração do jogo foi: %d hora(s)%n", ddj);

        sc.close();
    }
}
