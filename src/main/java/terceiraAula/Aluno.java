package terceiraAula;

import javax.swing.*;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;

    public void exibirStatus(){
        JOptionPane.showMessageDialog(null, "Nome " + nome);
        JOptionPane.showMessageDialog(null,"Nota " + nota);
        JOptionPane.showMessageDialog(null,"Matricula " + matricula);
    }

    public Aluno(String nome, int matricula){
        this.matricula = matricula;
        this.nome = nome;
        this.nota = 0;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota >= 0 && nota <= 10) {
            this.nota = nota;
        }else {
            JOptionPane.showMessageDialog(null,"A nota tem que ser entra 0 e 10!");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
