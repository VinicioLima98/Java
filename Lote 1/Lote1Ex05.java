package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex05

{
    public static void main (String args[]) {
        
        double a, b, c, x1, x2, delta;
        
        a= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C: "));
        
        delta = ((b*b)-(4*a*c));
        
        if (delta>= 0) {
            
           x1 = (-b + Math.sqrt(delta)) / (2 * a);
           x2 = (-b - Math.sqrt(delta)) / (2 * a);
           
           JOptionPane.showMessageDialog(null, "O valor de X1 é: "+ x1 + "\n O valor de X2 é: "+ x2 );
           
        } 
        
                
        
    }
}