import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número para fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;

        for(int i = fatorial; i >= 1 ; i--){
            multiplicacao *=  i;
        }
        System.out.printf("%d! = %d",fatorial, multiplicacao);
        sc.close();
    }
}