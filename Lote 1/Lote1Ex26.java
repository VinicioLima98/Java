/******************************************************************************
 * Programador: Vinicio Lima
 * Data: 24/08/17
 * 
 * objetivo: Receba 2 números inteiros. 
 * Verifique e mostre se o maior número é múltiplo do menor.  * 
 ******************************************************************************/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex26 {
    
    static Integer n1, n2;
    
    public static void main(String[] args) {
        
        ReceberDados();
        ExibirMaiorMultiplo();        
        
    }
    
    static void ReceberDados(){
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira mais um número inteiro"));
        
    }
    
    static void ExibirMaiorMultiplo(){
        
        if ((n1 > n2) && (n1 % n2 == 0)){
            
            JOptionPane.showMessageDialog(null, "O maior número é multiplo do segundo ");  
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "O maior número não é multiplo do primeiro ");
            
        }
        
    }
}
