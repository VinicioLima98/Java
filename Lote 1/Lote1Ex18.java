/*
Programador: Vinicio Lima
Data 24/08/17
Objetivo: Receba 2 valores inteiros. 
Calcule e mostre o resultado da diferença do maior pelo menor valor.
*/


package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex18 {
    
    static Integer n1, n2;
    
    public static void main(String[] args) {
        
        int n1, n2;
        
        ReceberDados();
        CalculoCondiçoes();
        
    }
    
    /***************************************************************************
    *Procedimento para coletar os números inteiros
    ****************************************************************************/
    
    static void ReceberDados()
    {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
    }
    
    /***************************************************************************
    * Procedimento para Calcular e Exibir os números
    ****************************************************************************/
    
    static void CalculoCondiçoes ()
    {
        if (n1 >= n2) {
            JOptionPane.showMessageDialog(null, n1-n2);
        }   
        else { JOptionPane.showMessageDialog(null, n2-n1);
        } 
    }
}
