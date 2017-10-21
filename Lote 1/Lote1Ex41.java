/*
* Programador: Vinicio Lima
* Data: 24/08/17
*
* Obejtivo: Receba 100 números inteiros reais. 
* Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
*
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex41 {
    
    static Integer num, maior, menor;
    
    public static void main(String[] args) {
   
        ReceberDados();
        
    
    }
    static void ReceberDados(){
        
        int contador;
        
        contador = 0;        
        
        while (contador <= 100)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            
           
            if (num > maior){
                maior = num; 
            }
                
            if (contador == 0){
               menor = num;
            }    
                
            if (num < menor){
                menor = num; 
            }          
                                       
                        
        contador += 1; 
        
       }
        if ((maior % 2) == 0 && (menor % 2 == 0)) {
            JOptionPane.showMessageDialog(null, ("O maior número digitado foi " + maior + "\nO menor número foi " +menor));
        }
        
    }
    

}