/*
* Programador: Vinicio Lima
* Data: 21/09/17
*/
package Exercicios;

import javax.swing.JOptionPane;

public class RecursivaEx023 {
    
    
    public static void main(String[] args) {
        
        double n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
    
            JOptionPane.showMessageDialog(null, calculoSerie(n, 1));
        
    }
    
    static double calculoSerie(double n, double div){
        
        double soma;
        
        
        if (n < 0 || n == 0){
            return 0;
            
        }
        else{
            soma = (fatorial(n/div) + calculoSerie(n-1, div+1));
            return soma;
                       
        }
    }
    
    static double fatorial(double n){
        
        double fatorial;
        
        if (n < 0 || n == 0){
            
            return 1;
        }
        else{
            
            fatorial = n * fatorial(n - 1);
            return fatorial;            
        }
        
    }
    
}
