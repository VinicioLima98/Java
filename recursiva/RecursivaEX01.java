/*
* Programador: Vinicio Lima
* Data: 20/09/17
*/

package Exercicios;

import javax.swing.JOptionPane;

public class RecursivaEX01 {
    
    public static void main(String[]args){
        
        int num = 1;
        
    
        JOptionPane.showMessageDialog(null, "A soma é " +fRecursivaSoma(num));
    
        
    }
    
    static int fRecursivaSoma(int x){
        
        int soma;
        
        if (x == 100){
            
            return x;
        }
        else{
            soma = x+fRecursivaSoma(x+1);
            
            return soma;
        }
        
    }
    
}
