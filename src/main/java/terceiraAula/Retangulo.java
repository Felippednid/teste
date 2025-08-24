package terceiraAula;

import javax.swing.*;

public class Retangulo {

    private double largura;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void calcularPerimetro(){
        JOptionPane.showMessageDialog(null,"O perimetro é: " + (2 * (altura + largura)));
    }
    public void calcularArea(){
        JOptionPane.showMessageDialog(null,"A area do triagulo é: " + (largura*altura));
    }

    public void setAltura(double altura) {
        if(largura > 0) {
            this.altura = altura;
        }else {
            JOptionPane.showMessageDialog(null,"A altura tem que ser maior que 0;");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura > 0) {
            this.largura = largura;
        }else {
            JOptionPane.showMessageDialog(null,"A largura tem que ser maior que 0;");
        }
    }
}
