import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaFilme = 0;
        double nota = 0;
        System.out.println("Digite três notas para o filme de 0 a 10: ");
        for (int i = 0; i < 3; i++) {
            nota = leitura.nextDouble();
            mediaFilme += nota;
        }

        mediaFilme /= 3;
        System.out.println(mediaFilme);
    }
}
