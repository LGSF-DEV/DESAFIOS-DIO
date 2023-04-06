import java.util.Scanner;

public class Ex3_Maior_E_Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media;
        int soma = 0;

        int count = 0;
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if(numero > maior){
                maior = numero;
            }
            soma += numero;
            count += 1;
            media = soma / count;
        } while(count < 5);
        System.out.printf("o maior número é : %d%n",maior);
        System.out.printf("A soma dos valores é: %d%n",soma);
        System.out.printf("A média dos valores é: %d%n",media);
        System.out.println("progranma encerrado!");
        sc.close();
    }
}