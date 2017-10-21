/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex40 {   
   
    static Integer numFinal;
    
    public static void main(String[] args) {
        
        
        numFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do último número da série"));
        
        CalculoFibonacciExibir();                
   
    }
    
    static void CalculoFibonacciExibir(){        
        
        int n1, n2, n3;
        
        n2 = 0;
        
        for (n1 = 1; n1 <= numFinal; n1++)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            
            System.out.println(n3);
            
        } 
    }
    
}
