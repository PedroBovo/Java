import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double soma = 0;
        double media = 0;
        int contador = 0;

        System.out.println("Digite quantas notas voce vai querer digitar: ");
        int quatidadeNota = leitura.nextInt();

        while (contador < quatidadeNota ){
            System.out.println(String.format("Digite a %da nota", contador+1));
            double nota = leitura.nextDouble();
            soma += nota;
            contador++;
        }
        media = soma / contador;
        System.out.println("a media desse filme é igual = " + media);
    }
}
