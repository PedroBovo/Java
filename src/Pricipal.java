import java.time.LocalDate;

public class Pricipal {
        public static void main(String[] args){

             double celcius = 27.5;
             double fahenits = (celcius * 1.8) + 32;
             String resultado = """
                     O resultado da conversao de %.2f celcius para fahenits é iqual a %.2f 
                     """.formatted(celcius, fahenits);
            System.out.println(resultado);
    }
}
