/*******************************************************************************
 * Programador: Vinicio Lima
 * Data: 24/08/17
 * 
 * Objetivo: Receba 2 valores inteiros e diferentes. 
 * Mostre seus valores em ordem crescente. 
*******************************************************************************/

package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex22

{
    static Integer n1, n2;
    public static void main(String args[]) {
        
        ReceberDados();
        ExibirOrdemCrescente();         
        
    }
    
    static void ReceberDados (){
        
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
       n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro diferente")); 
       
    }
    
    static void ExibirOrdemCrescente(){
        
        if (n1 > n2) {
            
            JOptionPane.showMessageDialog(null, "Maior valor " + n1 + "\nMenor valor " +n2);          
                     
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Maior valor "+ n2 + "\nMenor valor "+ n1);
            
        }
        
    }
            
}