/*
* Programador: Vinicio Lima
* Data: 21/09/17
*/
package Exercicios;

import javax.swing.JOptionPane;

public class RecursivaEx022 {
    
    public static void main(String[] args) {
        
        double divisor = Integer.parseInt(JOptionPane.showInputDialog("insira um número"));
        
        JOptionPane.showMessageDialog(null, calcSerie(1, divisor));
    }
    
    static double calcSerie(double num, double divisor){
        if (divisor > 0){
            
            double soma = (num / divisor) + calcSerie(num+1, divisor-1);
            
            return soma;
        }
        else
        {
            return 0;
        }
    }
    
}
