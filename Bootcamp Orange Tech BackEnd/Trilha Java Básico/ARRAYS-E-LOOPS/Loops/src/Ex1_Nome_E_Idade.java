import java.util.Scanner;

public class Ex1_Nome_E_Idade {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.print("Digite o nome: ");
            nome = sc.next();
            if(nome.equals("0")) break;

            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
        }

        System.out.println("programa encerrado!");
    }
}
