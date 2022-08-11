package model;

public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public void imprimir(){
        System.out.println("Dados da Conta de Poupança");
        super.imprimir();
        System.out.println("Dia de aniversário: " + diaAniversario + "\n");
    }
}
