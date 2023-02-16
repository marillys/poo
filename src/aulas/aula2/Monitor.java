package aulas.aula2;

public class Monitor {
    public String cor;
    public Boolean ligado;
    public Boolean transmitindo;

    public void inicializar()
    {
        this.desligar();
    }

    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
        this.transmitindo = false;
    }
    public void transmitir(){
        if(ligado) {
            this.transmitindo = true;
        }else{
            System.out.println("Precisa ligar antes...");
        }
    }

    public void status() {
        System.out.println("Monitor\n\t\tCor: "+this.cor +"\n\t\tLigado: " + this.ligado + "\n\t\tTransmitindo: " + this.transmitindo);
    }
}
