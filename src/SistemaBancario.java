import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Pedro Bovo";
        String conta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("***************************************************\n");
        System.out.println("                  Banco 4:20 \n                           ");
        System.out.println(String.format("nome:                   %s", nome));
        System.out.println(String.format("Conta:                  %s", conta));
        System.out.println(String.format("Saldo Inicial:          %.2f", saldoInicial));
        System.out.println("\n****************************************************\n\n");
        System.out.println(" Operacões\n        ");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber Valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Encerrar Sessão\n");
        System.out.println("Digite a opção desejada: ");
        int opcao = leitura.nextInt();
        while(opcao != 4){
            switch (opcao){
                case 1:
                    System.out.println(String.format("O saldo atual é R$%.2f", saldoInicial));
                    System.out.println(" \nOperacões\n        ");
                    System.out.println("1- Consultar saldos");
                    System.out.println("2- Receber Valor");
                    System.out.println("3- Tranferir valor");
                    System.out.println("4- Encerrar Sessão\n");
                    System.out.println("Digite a opção desejada: ");
                    opcao = leitura.nextInt();
                case 2:
                    System.out.println("Digite o valor que ira receber: ");
                    double receber = leitura.nextDouble();
                    saldoInicial += receber;
                    System.out.println(String.format("Saldo atualizado R$%.2f", saldoInicial));
                    System.out.println(" \nOperacões\n        ");
                    System.out.println("1- Consultar saldos");
                    System.out.println("2- Receber Valor");
                    System.out.println("3- Tranferir valor");
                    System.out.println("4- Encerrar Sessão\n");
                    System.out.println("Digite a opção desejada: ");
                    opcao = leitura.nextInt();
                case 3:
                    System.out.println("Digite o Valor que vai transferir: ");
                    double transferir = leitura.nextDouble();
                    while(transferir > saldoInicial){
                        System.out.println("Valor de transferencia maior que o saldo! Digite outro valor");
                        transferir = leitura.nextDouble();
                    }
                    saldoInicial -= transferir;
                    System.out.println(String.format("Saldo atualizado para R$%.2f",saldoInicial));
                    System.out.println(" \nOperacões\n        ");
                    System.out.println("1- Consultar saldos");
                    System.out.println("2- Receber Valor");
                    System.out.println("3- Tranferir valor");
                    System.out.println("4- Encerrar Sessão\n");
                    System.out.println("Digite a opção desejada: ");
                    opcao = leitura.nextInt();
                default:
                    if (opcao != 4){
                        System.out.println("Opção invalida");
                        System.out.println(" \nOperacões\n        ");
                        System.out.println("1- Consultar saldos");
                        System.out.println("2- Receber Valor");
                        System.out.println("3- Tranferir valor");
                        System.out.println("4- Encerrar Sessão\n");
                        System.out.println("Digite a opção desejada: ");
                        opcao = leitura.nextInt();
                    }
            }
            System.out.println("Muito Obrigado por fazer parte do nosso banco!");
            System.out.println("Deixe uma nota de 1 a 5 pelo nosso  antendimento sendo 1 Muito Ruim e 5 Muito bom:");
            int nota = leitura.nextInt();
        }






    }
}
