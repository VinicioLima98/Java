/*
* Programador: Vinicio Lima
* Data: 22/09/17
*/
package Exercicios;

import javax.swing.JOptionPane;

public class RecursivaEx03 {
    
    public static void main(String[]args){
        
        int base, expoente;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor da base?"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor do expoente?"));
        
        JOptionPane.showMessageDialog(null, "O valor da potência é "+fRecursivaPot(base, expoente));
    }
    
    
    static int fRecursivaPot(int b, int exp){
        
        int pot;
        
        if (exp == 0){
            return 1;
        }
        else{            
            pot = b * fRecursivaPot(b, exp -1);

            return pot;
            
        }
        
    }
}

