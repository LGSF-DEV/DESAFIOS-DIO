import java.util.Scanner;
import java.util.Locale;

public class BoletimEstudantil {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a 1° nota: ");
        double nota_1 = sc.nextDouble();
        System.out.print("digite a 2° nota: ");
        double nota_2 = sc.nextDouble();
        double mediaFinal = (nota_1 + nota_2) /2;

        if(mediaFinal<6){
            
            System.out.printf("media final: %.2f%n", mediaFinal);
            System.out.println("REPROVADO");
        }	
        else if(mediaFinal==6){
            
            System.out.printf("media final: %.2f%n", mediaFinal);
            System.out.println("PROVA MINERVA"); 
        }
        else{
            
            System.out.printf("media final: %.2f%n", mediaFinal);
            System.out.println("APROVADO");
        }
        sc.close();
    }

}