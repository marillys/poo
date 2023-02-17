import aulas.animal.*;
import aulas.aula2.Caneta;
import aulas.aula2.Monitor;
import aulas.aula4.CanetaAula4;
import aulas.conta.Conta;
import aulas.controle.ControleRemoto;
import aulas.livraria.Livro;
import aulas.livraria.Pessoa;
import aulas.lutas.Luta;
import aulas.lutas.Lutador;
import aulas.pessoas.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma aula (2 a 13)");
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

            case 9:
                aula9();
                break;

            case 10:
                aula10();
                break;

            case 11:
                aula11();
                break;

            case 12:
                //polimorfismo de sobreposição
                aula12();
                break;

            case 13:
                //polimorfismo de sobrecarga
                aula13();
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

        luta.marcarLuta(lutador[5], lutador[4]);
        luta.lutar();
        lutador[5].status();
        lutador[4].status();

        luta.marcarLuta(lutador[1], lutador[1]);
        luta.lutar();

        luta.marcarLuta(lutador[0], lutador[5]);
        luta.lutar();
    }

    public static void aula9() {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Pedro", 10, "M");
        pessoa[1] = new Pessoa("Maria", 15, "F");

        livro[0] = new Livro("Aprendendo Java", "José da Silva", 300, pessoa[0]);
        livro[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, pessoa[1]);
        livro[2] = new Livro("Java Avançado", "Maria Candido", 800, pessoa[0]);

        System.out.println(livro[0].detalhes());
        livro[0].abrir();
        livro[0].folhear(1000);
        System.out.println(livro[0].detalhes());
    }

    public static void aula10() {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Pedro");
        aluno.setNome("Maria");
        professor.setNome("Cláudio");
        funcionario.setNome("Fabiana");

        aluno.setCurso("Informática");
        professor.setSalario(2500.45f);
        funcionario.setSetor("Estoque");

        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());
    }

    public static void aula11() {
        Visitante visitante = new Visitante();

        visitante.setNome("Vinicius");
        visitante.setIdade(26);
        visitante.setSexo("M");
        System.out.println(visitante.toString());

        Aluno aluno = new Aluno();
        aluno.setNome("Claúdia");
        aluno.setCurso("Informática");
        aluno.setSexo("F");
        aluno.pagarMensalidade();

        Bolsista alunoBolsista = new Bolsista();
        alunoBolsista.setNome("Ana");
        alunoBolsista.setCurso("Administração");
        alunoBolsista.setBolsa(450f);
        alunoBolsista.setSexo("F");
        alunoBolsista.pagarMensalidade();
    }

    public static void aula12() {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();

        ave.locomover();

        peixe.locomover();

        reptil.locomover();

        mamifero.locomover();

        canguru.locomover();

        cachorro.emitirSom();

        cobra.locomover();
    }

    public static void aula13() {
        Cachorro cachorro = new Cachorro();

        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11,45);
        cachorro.reagir(2,4.5f);
    }
}