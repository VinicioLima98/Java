package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex15 

{
    public static void main(String[] args) {
        
        double a, b, hip;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de um cateto"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de outro cateto"));
        
        hip = (Math.sqrt((a * a)+(b * b)));
        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é "+hip);
    }
}
