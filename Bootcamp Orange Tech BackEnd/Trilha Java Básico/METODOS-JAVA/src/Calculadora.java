import java.util.Locale;

public class Calculadora {

    public static void soma(double numero_1, double numero_2){
        Locale.setDefault(Locale.US);
        double resultado = numero_1 + numero_2;
        System.out.printf("A soma de %.1f + %.1f = %.1f%n",numero_1, numero_2, resultado);
    }

    public static void subtracao(double numero_1, double numero_2){
        Locale.setDefault(Locale.US);
        double resultado = numero_1 - numero_2;
        System.out.printf("A subtração de %.1f - %.1f = %.1f%n",numero_1, numero_2, resultado);
    }

    public static void mutiplicacao(double numero_1, double numero_2){
        Locale.setDefault(Locale.US);
        double resultado = numero_1 * numero_2;
        System.out.printf("A mutiplicaçãode %.1f X %.1f = %.1f%n",numero_1, numero_2, resultado);
    }

    public static void divisao(double numero_1, double numero_2){
        Locale.setDefault(Locale.US);
        double resultado = numero_1 / numero_2;
        System.out.printf("A divisão de %.1f / %.1f = %.1f%n",numero_1, numero_2, resultado);
    }

}
