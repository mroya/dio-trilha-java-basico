public class operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        int numero = 5;

        numero++;

        System.out.println(numero);

        boolean variavel = true;
        
        System.out.println(!variavel);


        //Operador ternário
        
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        // Validações
        int num1 = 4;
        int num2 = 2;

        boolean simNao = num1 == num2;
        
        System.out.println("Num1 é igual a Num2? " + simNao);

        simNao = num1 != num2;

        System.out.println("Num1 é diferente do Num2? " + simNao);
        
        //Validando strings
        
        String nome1 = "Marcio";
        String nome2 = new String("Marcio");

        System.out.println(nome1.equals(nome2));
    }
}
