public class EX1_Ordem_Inversa {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {-5, 10, -15, 20, -25, 30};

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println();
        System.out.print("Vetor: ");
        for (int i = (vetor.length - 1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }
    }
}
