import java.util.Scanner;

public class EX2_Consoantes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quant_consoantes = 0;

        int count = 0;

        do {
            System.out.print("Letra: ");
            String letra = sc.next();

            if(!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quant_consoantes = quant_consoantes + 1;
            }
            count++;
        } while (count < consoantes.length);
        
        System.out.print("Consoantes: ");
        for (String consoante :consoantes) {
            if(consoante != null) {
                System.out.printf("%s ",consoante);
            }
        }
        System.out.printf("Quantidade de consoantes: %d%n",quant_consoantes);
        sc.close();
    }
}