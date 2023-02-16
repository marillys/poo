package aulas.conta;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        setSaldo(0f);
        setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String dono,String tipo) {
        this.setDono(dono);
        this.setTipo(tipo);
        this.setStatus(true);

        float valor=0;

        switch (tipo) {
            case "CC":
                valor=50f;
                break;
            case "CP":
                valor =150f;
                break;
            default:
                break;
        }
        depositar(valor);
    }

    public void fecharConta() {
        if (this.isStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("Conta não pode ser fechada porque tem saldo");
            } else if (this.getSaldo() < 0) {
                System.out.println("Conta não pode ser fechada porque está com saldo negativo");
            } else {
                this.status = false;
                System.out.println("Conta Fechada com sucesso");
            }
        } else {
            System.out.println("Conta já está fechada");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado na conta de "+ this.getDono());
        } else {
            System.out.println("Não é possível depositar em contas fechadas");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else
            {
                System.out.println("Cliente " + this.getDono() + "não tem saldo suficiente para saque");
            }
        } else {
            System.out.println("Não é possível sacar em contas fechadas");
        }
    }

    public void pagarMensal() {
        float mensalidade = 0;
        if (this.status) {
            switch (this.getTipo()) {
                case "CC":
                    mensalidade = 12;
                    break;
                case "CP":
                    mensalidade = 20;
                    break;
                default:
                    break;
            }

            if (getSaldo() >= mensalidade) {
                sacar(mensalidade);
            } else {
                System.out.println("Não tem saldo..");
            }


        } else {
            System.out.println("Conta está fechada");
        }
    }

    public void consultarConta() {
        System.out.println("---------------------\nConta " + getDono() + "\n\tTipo da Conta: " + getTipo() + "\n\tStatus da Conta: " + isStatus() + "\n\tSaldo: " + getSaldo());
    }
}
