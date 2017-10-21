package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex03

{
    public static void main (String args[]) {
        
        int b, alt, ar;
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do tringulo: "));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        ar = (b * alt)/2;
        System.out.println("O valor da área do triângulo é: "+ar);
    }
}
