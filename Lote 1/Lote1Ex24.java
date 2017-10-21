/*******************************************************************************
 * Programador: Vinicio Lima
 * Data: 27/08/17
 * 
 * Objetivo:
 * Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 ******************************************************************************/

package Exercicios;

import javax.swing.JOptionPane;
        
public class Lote1Ex24 {
    
    public static void main(String[] args) {
        
        VerificarEMostrarNumDivisivel();             
        
    }
    
    static void VerificarEMostrarNumDivisivel(){
        
        double n;        
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro"));
        
        if (n % 2 == 0 && n % 3 == 0){
            
            JOptionPane.showMessageDialog(null, "O número "+n + (" é divisível por 2 e 3"));
            
        }        
        else if (n % 2 == 1){
            
            JOptionPane.showMessageDialog(null, "O número " +n + (" é divisível por 3"));
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "O número "+n + (" é divisível por 2"));                
        } 
    }
    
}
