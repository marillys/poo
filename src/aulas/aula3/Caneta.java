package aulas.aula3;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void escrever(){}

    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar!");
        }else{
            System.out.println("Rabiscando.....");
        }
    }

    public void pintar()
    {

    }

    public void status(){
        System.out.println("Caneta\n\t\tModelo: "+ this.modelo + "\n\t\tCor: " + this.cor + "\n\t\tponta: "+ this.ponta + "\n\t\tcarga: " +
                this.carga + "\n\t\tTampada: " + this.tampada);
    }

    public void tampar()
    {
        this.tampada = true;
    }

    private void destampar()
    {
        this.tampada = false;
    }
}
