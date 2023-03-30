public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void Ligar(){
        ligada = true;
    }

    public void Desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume += 1;
    }
    
    public void diminuirVolume(){
        volume -= 1;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal += 1;
    }
    
    public void diminuirCanal(){
        canal -= 1;
    }
}