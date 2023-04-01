import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da tabuada: ");
        int tabuada = sc.nextInt();

        System.out.print("Digite o multiplicador: ");
        int multiplicador = sc.nextInt();
        
        System.out.printf("Tabuada de %d:%n ",tabuada);

        for(int i = 1; i <= multiplicador; i++){
            int resultado = tabuada * i;
            System.out.println();
            System.out.printf("%d X %d = %d",tabuada, i, resultado);
        }
        System.out.println();
        System.out.print("Fim do programa!");
        sc.close();
    }
    
}