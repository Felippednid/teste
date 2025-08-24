package terceiraAula;

import javax.swing.*;

public class Livro {
    private  String titulo;
    private String autor;
    private int anoPublicado;

    public Livro(String titulo, String autor, int anoPublicado){
        this.anoPublicado = anoPublicado;
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        if(anoPublicado > 0) {
            this.anoPublicado = anoPublicado;
        }else {
            JOptionPane.showMessageDialog(null,"O ano tem que ser maior que 0!");
        }
    }
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicado);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
