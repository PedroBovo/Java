import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhação {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int random = new Random().nextInt(100);


        System.out.println("Vamos jogar? Aperte C para começar");
        String comeco = leitura.nextLine();
       while(!comeco.equalsIgnoreCase("C")){
            System.out.println("Voce errou tente apertar C novamente");
            comeco = leitura.nextLine();
        }
        System.out.println("Voce tera 5 tentativas para acertar um numero de 1 a 100");

        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("%da tentativa", i+1));
            int tentativa = leitura.nextInt();
            if (tentativa < random){
                System.out.println(String.format("O numero %d é menor que o numero aleatorio", tentativa));
            } else if (tentativa > random) {
                System.out.println(String.format("O numero %d é maior que o numero aleatorio", tentativa));
            }else {
                System.out.println(String.format("Parabens voce acertou o numero é %d ", tentativa));
            }

        }
    }
}
