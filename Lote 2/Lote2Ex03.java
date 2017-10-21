/*
Programador: Vinicio Lima
Data: 21/09/17
Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex03 {
    
    public static void main(String[] args) {
      
        int vt1[] = new int[3];
        int vt2[] = new int[3];
        int vt3[] = new int[6];
        int i;        
        
        
        for (i = 0; i <= 2; i++){
            
            vt1[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o "+(i+1)+"º número"));
            
            vt3[i] = vt1[i];
        }
        for (i = 0; i < 3; i++){
            vt2[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o "+(i+4)+"º número"));
            vt3[i+3] = vt2[i];
        }
        
        for (i = 0; i <= 5; i++){
            System.out.println(vt3[i]);
        }
        
    }
    
}
