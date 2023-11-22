import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Digite sua nota para o filme de 0 a 5: ");
        double notaFilme = leitura.nextDouble();
        while (notaFilme >= 5){
            System.out.println("Nota Fora Dos paramentros");
            notaFilme = leitura.nextDouble();
        }
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();


        System.out.println(String.format("o Filme é %s a nota que foi dada é %.2f e o ano é %d", filme, notaFilme, anoDeLancamento));

    }
}
