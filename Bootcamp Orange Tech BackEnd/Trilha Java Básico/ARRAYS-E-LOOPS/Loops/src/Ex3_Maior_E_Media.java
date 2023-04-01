import java.util.Scanner;

public class Ex3_Maior_E_Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        int count = 0;
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            count += 1;
        } while(count < 5);
    }
}