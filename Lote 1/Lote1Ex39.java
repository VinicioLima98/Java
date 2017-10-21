/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex39 {
    
    static Integer deno;
    
    public static void main(String[] args) {      
        
                
        deno = Integer.parseInt(JOptionPane.showInputDialog("Informe o denominador"));
        
        FatorialSerieExibir();
         
        
    }
    
    static void FatorialSerieExibir(){
        
        int t, total, num;
        
        total = 1;
        num = 1;
        
        for (t = 1; t <= deno; t++ )
        {
            total = total * t;
          
            System.out.println("O fatorial da série é: " + num + "/" + total);
            deno = deno -1;
            
        } 
        
    }
    
}
