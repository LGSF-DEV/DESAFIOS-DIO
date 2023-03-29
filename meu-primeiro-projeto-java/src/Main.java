import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner SC = new Scanner(System.in);
        System.out.print("Digite o 1° nome: ");
        String primeiroNome = SC.nextLine();
        System.out.print("Digite o 2° nome: ");
        String segundoNome = SC.nextLine();

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.printf("Nome Completo: %s",nomeCompleto);
    }   

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
