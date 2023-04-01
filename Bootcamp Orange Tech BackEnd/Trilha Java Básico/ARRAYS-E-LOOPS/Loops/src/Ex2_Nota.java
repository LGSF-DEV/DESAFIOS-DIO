import java.util.Scanner;
import java.util.Locale;

public class Ex2_Nota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.print("Digite a nota: ");
        nota = sc.nextInt();

        while(nota < 0 || nota >10){
            System.out.print("Nota Inválid! Digite Novamente: ");
            nota = sc.nextInt(); 
        }
        sc.close();
        System.out.println("programa encerrado!");
    }
}