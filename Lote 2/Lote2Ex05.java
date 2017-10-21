/*
Programador: Vinicio Lima
Data: 21/09/17
Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, 
segundo: 10 ∑ i = 1 (A[1] – A[21–1]) 
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex05 {
    
    public static void main(String[] args) {
        
        int vetor[] = new int[20];
        vetor = funcaoReceberVetor(vetor);
        pConcatenarVetor(vetor);
    }
    
    static int[] funcaoReceberVetor(int vetor[]){
        
        int i;
        
        for (i = 0; i < 20; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i+1)+"º número"));
        }        
        return vetor;
    }
    
    static void pConcatenarVetor(int vetor[]){
        
        int soma[] = new int[10];
        int i;
        
        for (i = 0; i< 10; i++){
           soma[i] = vetor[i] - vetor[19-i];
           
            System.out.println(soma[i]);
        }
        
    }
    
}
