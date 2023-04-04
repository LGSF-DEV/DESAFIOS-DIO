
public class RodarAplicacao {
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.setCor("Azul");
        carro.setModelo("BMW Série 3");
        carro.setCacapidadeTanque(59);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());

        System.out.println();
        
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
    }
}