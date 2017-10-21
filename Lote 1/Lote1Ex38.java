/*
    Nome do programador: Vinicio Lima
    data da elaboração: 16/08/2017
    Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. 
    Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/

package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex38 {
    
    public static void main(String[] args) {
        
        int n1, n2, soma = 0, maior, menor, impar;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        
                
        if (n1 > n2) 
        {
            maior = n1;
            menor = n2;
        } 
        else{
            maior = n2;
            menor = n1;
        }
        
        for (impar = menor+1; impar < maior; impar++){
            if (impar % 2 == 1){
                soma =  soma + impar;
            }
        }
          
        JOptionPane.showMessageDialog(null, "A soma dos ímpares é "+ soma);
          
          
          
    }   
        
}
    

