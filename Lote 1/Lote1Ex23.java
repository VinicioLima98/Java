/*******************************************************************************
 * Programador: Vinicio Lima
 * Data: 24/08/17
 * 
 * Objetivo: Receba 3 valores obrigatoriamente em ordem crescente 
 * e um 4º valor não necessariamente em ordem. 
 * Mostre os 4 números em ordem crescente. 
********************************************************************************/

package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex23

{
    static Integer n1, n2, n3, n4;
    
    public static void main(String[] args) {
        
        ReceberDados();
        MostrarEmOrdemCrescente();
        
    }
    
    static void ReceberDados(){
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número em ordem crescente"));
        n3 = Integer.parseInt (JOptionPane.showInputDialog("Insira mais um número em ordem crescente"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro de de qualquer valor"));
    }
    
    static void MostrarEmOrdemCrescente(){
    
    if (n4<n1){
        
            JOptionPane.showMessageDialog(null, n4 + "," +  n1 + "," +  n2 + "," + n3);
            
    }        
    else if (n4 < n2){
        
            JOptionPane.showMessageDialog(null, n1 + "," +  n4 + "," + n2  + "," + n3);
                
    }
    else if (n4 < n3){
        
            JOptionPane.showMessageDialog(null, n1 + "," +  n2 + "," + n4  + "," + n3);            
    
    }
    else{
        
            JOptionPane.showMessageDialog(null, n1 + "," +  n2 + "," +  n3 + "," + n4);       
        
    }
    
}
}