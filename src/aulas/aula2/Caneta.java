package aulas.aula2;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public Boolean tampada;

    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar!");
        }else{
            System.out.println("Rabiscando.....");
        }
    }

    public void status(){
        System.out.println("Caneta\n\t\tModelo: "+ this.modelo + "\n\t\tCor: " + this.cor + "\n\t\tponta: "+ this.ponta + "\n\t\tcarga: " +
                this.carga + "\n\t\tTampada: " + this.tampada);
    }

    public void tampar()
    {
        this.tampada = true;
    }

    public void destampar()
    {
        this.tampada = false;
    }
}
