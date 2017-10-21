package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex11

{
    public static void main(String[] args) {
        
        double raio, pi, comp;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência "));
        pi = 3.14;
        comp = (2 * pi * raio);
        
        JOptionPane.showMessageDialog(null, ("O valor do comprimento da circunferência é "+comp));
        
        
    }
}