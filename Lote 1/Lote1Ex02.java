package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex02

{
    public static void main (String args[]) {
        
        double s, sr;
        
        s = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu salário: "));
        sr = s + (s*0.15);
        System.out.println("O salário reajustado é: "+ sr);
        
        
        
    }
}