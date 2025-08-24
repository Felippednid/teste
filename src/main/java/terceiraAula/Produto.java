package terceiraAula;

import javax.swing.*;

public class Produto {

    private String nome;
    private double preco;
    private double quantidadeEstoque;

    public void vender(int quantidade){
        if(quantidadeEstoque >= 0) {
            quantidadeEstoque = quantidadeEstoque - quantidade;
        }else {
            JOptionPane.showMessageDialog(null,"Estoque insuficiente para a venda!");
        }
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0) {
            quantidadeEstoque = quantidadeEstoque + quantidade;
        }else {
            JOptionPane.showMessageDialog(null,"A quantidade tem que ser maior que 0!");
        }
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        if(quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        }else {
            JOptionPane.showMessageDialog(null,"A quantidade no estoque é menor que 0!");
        }

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }else {
            JOptionPane.showMessageDialog(null,"O preço é menor que 0!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
