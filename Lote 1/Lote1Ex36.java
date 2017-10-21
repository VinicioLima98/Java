/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex36 {
    
    static Integer denoPrimario;
    
    public static void main(String[] args) {       
        
        denoPrimario = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do denominador"));
       
        ExibirDenominador();
        
    }
    
    static void ExibirDenominador(){
        
        int deno, num;
        
        num = 1;
        deno = 0;
        
        
        System.out.println("Os resultados são: ");        
        while (deno < denoPrimario) 
        {
            deno = (deno + 1);
            
            System.out.println("\n" + num +  "/" + deno);
            
        }
    }
    
}
