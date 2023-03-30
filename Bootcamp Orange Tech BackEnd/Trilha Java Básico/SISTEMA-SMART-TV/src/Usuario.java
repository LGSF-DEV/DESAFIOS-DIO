public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.Ligar();
        System.out.printf("Novo Status -> TV Ligana ? %b%n",smartTv.ligada);

        smartTv.mudarCanal(15);
        System.out.printf("Canal Atual: %d%n",smartTv.canal);

        smartTv.aumentarVolume();
        System.out.printf("Volume Atual: %d%n",smartTv.volume);
    }
}