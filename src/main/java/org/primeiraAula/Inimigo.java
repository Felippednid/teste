package org.primeiraAula;

import javax.swing.*;

public class Inimigo {

    public String nome;
    public String tipo;
    public double froca;

    public  void atacar (){
        JOptionPane.showMessageDialog(null,"O inimigo atacou com força "
                + froca+ " ! ");
    }
}
