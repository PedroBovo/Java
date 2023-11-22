public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2002;
        boolean incluidoNoPlano = true;
        double nota = 3.5;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println("lançamentos que o clientes estao curtindo");
        } else {
            System.out.println("filme antigao");
        }

        if(incluidoNoPlano == true && tipoPlano.equalsIgnoreCase("plus")){
            System.out.println("Filme liberado");

        }else{
            System.out.println("Deve alugar!");
        }
    }
}
