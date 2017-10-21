package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex01 

{
    public static void main (String args[]) {
        
        int l, a;
        
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um lado do quadrado: "));
        a = l * l;
        System.out.println("O valor da área do quadrado é:" +a);      
        
        
    }

}
