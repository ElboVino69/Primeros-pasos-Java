import java.util.Scanner;

public class Loops {
public static void main(String[] args) {
    double nota = 0;
    double mediaEvaluaciones = 0;
    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
        System.out.println("Escribe la nota que le darías a la pelicual Matrix");
        nota = teclado.nextDouble();
        mediaEvaluaciones = mediaEvaluaciones + nota;
        
    }
    System.out.println("La media de evaluaciones es: " + " "+ (mediaEvaluaciones/3));
}
}
