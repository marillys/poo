package aulas.controle;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---------- MENU ----------\nEstá ligado? " + this.isLigado() + "\nVolume " + this.getVolume());

        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println("\nEstá tocando? " + this.isTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu.....");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
}
