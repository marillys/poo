package aulas.aula4;

public class CanetaAula4 {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public CanetaAula4()
    {
        this.tampar();
        this.cor = "Azul";
    }
    public CanetaAula4(String m, String c, float p)
    {
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public void tampar()
    {
        this.tampada = true;
    }

    private void destampar()
    {
        this.tampada = false;
    }

    public void status(){
        System.out.println("Caneta\n\t\tModelo: "+ this.modelo +
                "\n\t\tCor: " + this.cor +
                "\n\t\tponta: "+ this.ponta
                //+ "\n\t\tcarga: " + this.carga
                + "\n\t\tTampada: " + this.tampada
        );
    }
}
