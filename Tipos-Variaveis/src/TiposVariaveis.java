import javax.print.DocFlavor.STRING;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "Márcio";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 10;

        numero = 5;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
