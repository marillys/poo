import aulas.aula2.Caneta;
import aulas.aula2.Monitor;
import aulas.aula4.CanetaAula4;
import aulas.conta.Conta;
import aulas.controle.ControleRemoto;
import aulas.lutas.Luta;
import aulas.lutas.Lutador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma aula (2 a 10)");
        int opcaoEscolha = Integer.parseInt(teclado.nextLine());

        switch (opcaoEscolha) {
            case 2:
                canetas(); //Classe de canetas da aula 02
                monitor();//Classe monitor - aula 2 - exercício
                break;

            case 3:
                canetas_aula3();
                break;

            case 4:
                aula4();
                break;

            case 5:
                aula5();
                break;

            case 6:
                aula6();
                break;

            case 7:
                Lutador lutador[] = aula7();

                lutador[0].apresentar();
                lutador[1].status();
                break;

            case 8:
                aula8();
                break;

            default:
                System.out.println("Não tem exercícios para esta aula...");
                break;
        }
    }

    public static void canetas() {
        //--------------------- Caneta c1
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        //--------------------- Caneta c2
        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }

    public static void monitor() {
        Monitor monitor = new Monitor();

        monitor.inicializar();
        monitor.transmitir();
        monitor.ligar();
        monitor.transmitir();
        monitor.status();

        monitor.desligar();
        monitor.status();
    }

    public static void canetas_aula3() {
        aulas.aula3.Caneta caneta = new aulas.aula3.Caneta();

        caneta.modelo = "BIC Cristal";
        caneta.cor = "Azul";
        caneta.tampar();
        caneta.status();
    }

    public static void aula4() {
        CanetaAula4 caneta = new CanetaAula4("NIC", "Rosa", 0.4f);
        caneta.status();
    }

    public static void aula5() {
        Conta contaCreusa = new Conta();

        contaCreusa.abrirConta("Creusa", "CC");
        contaCreusa.consultarConta();
        contaCreusa.depositar(500);
        contaCreusa.sacar(100f);
        contaCreusa.consultarConta();
        contaCreusa.pagarMensal();
        contaCreusa.consultarConta();

        Conta contaJubileu = new Conta();
        contaJubileu.abrirConta("Jubileu", "CP");
        contaJubileu.depositar(300);
        contaJubileu.consultarConta();
        contaJubileu.pagarMensal();
        contaJubileu.consultarConta();
    }

    public static void aula6() {
        ControleRemoto controle = new ControleRemoto();

        controle.ligar();
        controle.maisVolume();
        controle.abrirMenu();
    }

    public static Lutador[] aula7() {
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 3);
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutador[3] = new Lutador("DeadCode", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutador[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutador[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);


        return lutador;
    }

    public static void aula8() {
        Lutador lutador[] = new Lutador[6];
        Luta luta = new Luta();

        lutador = aula7();

        luta.marcarLuta(lutador[5],lutador[4]);
        luta.lutar();
        lutador[5].status();
        lutador[4].status();

        luta.marcarLuta(lutador[1], lutador[1]);
        luta.lutar();

        luta.marcarLuta(lutador[0], lutador[5]);
        luta.lutar();
    }
}
