package terceiraAula;

import javax.swing.*;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String titular;

    public void depositar(double valor){
        if (valor > 0) {
            saldo = saldo + valor;
            JOptionPane.showMessageDialog(null,"Deposito realizado! ");
        }
        JOptionPane.showMessageDialog(null,"Não foi possivel realizar deposito! ");
    }

    public void sacar(double valor){
        if (valor >= saldo) {
            saldo = saldo + valor;
            JOptionPane.showMessageDialog(null,"Saque realizado! ");
        }
        JOptionPane.showMessageDialog(null,"Não foi possivel realizar saque! ");
    }

    public double exibirSaldo(){
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
