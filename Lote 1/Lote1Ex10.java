package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex10

{
    public static void main(String[] args) {
        
        double n1, n2, dif;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número real: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira novamente um número real: "));
        
        dif = n1 - n2;
        
        JOptionPane.showMessageDialog(null, "A diferença entre os números é: "+dif);
    }
}