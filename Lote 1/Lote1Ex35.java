/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex35 {
    
     
    public static void main(String[] args) {        
               
        CalculoFatorial();    

    }
    
    static void CalculoFatorial(){            
        
        int contador = 1;
        int num, fat = 1;        

        while (contador <= 1)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número "));
            
            for(int i = 1; i <= num; i++){
                
                fat = fat * i;
            }            
            JOptionPane.showMessageDialog(null, + num + "! = " + fat);
            
            contador++;
        }

    }
}

    

