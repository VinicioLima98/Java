package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex06

{
    public static void main(String[] args) {
        
        double x, y, xa, yb;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        
        xa = x;
        yb = y;
        
        y = xa;
        x = yb;
        
        JOptionPane.showMessageDialog(null, "O valor de x é: "+x + "\n O valor de y é: "+y);
        
        
    }
}