/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex37 {
    
    
    static Integer num, num2;
    
    public static void main(String[] args) {
        
        ReceberDados();
        ExibirTabuada();             
        
    }
    
    static void ReceberDados(){
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que você deseja calcular"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite até quando deseja calcular"));
        
    }
    
    static void ExibirTabuada(){
        
        int contador;
        
        for (contador = 0; contador <= num2; contador++ )        
        {
            System.out.println(num + "x" +  contador + "=" +  num * contador);
        } 
    }
}
