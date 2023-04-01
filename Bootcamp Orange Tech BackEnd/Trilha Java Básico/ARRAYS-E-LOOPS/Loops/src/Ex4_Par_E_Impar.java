import java.util.Scanner;

public class Ex4_Par_E_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant_numeros;
        int numero;
        int quant_pares = 0; 
        int quant_impares = 0;

        System.out.print("Quantidade de números: ");
        quant_numeros = sc.nextInt();
        int count = 0;
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            if(numero % 2 == 0){
                quant_pares += 1;
            }
            else{
                quant_impares += 1;
            }
            count += 1;
        } while (count < quant_numeros);
        System.out.printf("Quantidade de números pares: %d%n", quant_pares);
        System.out.printf("Quantidade de números impares %d%n",quant_impares);
        sc.close();
    }
}