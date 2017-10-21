/*******************************************************************************
 * 
 * Programador: Vinicio Lima
 * Data: 24/08/17
 * Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles
 * 
 *******************************************************************************/

package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex19 {
    
    static Double n1, n2;
    
    public static void main(String[] args) {
        
        ReceberDados();
        CondiçaoMaiorMenor();
        
    }
    
    /***************************************************************************
    * Procedimento para coletar 2 números reais
    ***************************************************************************/
    static void ReceberDados()
    {
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número real"));  
    }
    
    /***************************************************************************
     * Procedimento para mostrar o maior e o menor valor real
    ***************************************************************************/
    static void CondiçaoMaiorMenor()
    {
      if (n1 >= n2) {
        JOptionPane.showMessageDialog(null, n1);
        }
        else { 
        JOptionPane.showMessageDialog(null, n2);
        }  
    }
}
