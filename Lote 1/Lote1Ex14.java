package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex14

{
    public static void main(String[] args) {
        
        double ang, ang2, ang3;
        
        ang = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de um ângulo do triângulo"));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de outro ângulo do triângulo"));
        
        ang3 = (180 - ang2 - ang);
        
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é "+ang3);
        
         
    }
}