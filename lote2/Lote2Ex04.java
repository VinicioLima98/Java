/*
Programador: Vinicio Lima
Data: 21/09/17
Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir: 
a. A média do grupo; 
b. A quantidade de notas acima do grupo; 
c. As posições dos valores abaixo da média do grupo. 
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex04 {
    
    public static void main(String[] args) {
      
        double vetor[] = new double[30];
        double[] posicaoVetor = new double[30];
        
        exibir(posicaoVetor, vetor);  
        
    }
    
    static void exibir(double vetor[], double[] posicaoVetor){
        
        int i, ac = 0;
        double media = 0;
        
        for (i = 0; i <= 29; i++){
            
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o"+ (i+1)+ "º número"));
            media += vetor[i];
        }
        
        media /= 30;
        
        for (i = 0; i <= 29; i++){
            if (vetor [i] >= media){
                ac++;
            }
            else                
            { 
                posicaoVetor[i] = i;
            }
        }
        
        JOptionPane.showMessageDialog(null, media+ "\n"+ ac);
        
        for (i = 0; i <= 29; i++){
            if (posicaoVetor[i] != 0){
                System.out.println("\n"+posicaoVetor[i]);
            }
        }
    }
    
}
