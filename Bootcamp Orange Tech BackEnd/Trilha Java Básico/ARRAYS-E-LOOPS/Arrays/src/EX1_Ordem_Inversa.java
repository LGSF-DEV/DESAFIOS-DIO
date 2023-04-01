public class EX1_Ordem_Inversa {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {-5, 10, -15, 20, -25, 30};

        int count = 0;
        while (count < (vetor.length-1)) {
            System.out.println(vetor[count]);
            count++;
        }
    }
}
