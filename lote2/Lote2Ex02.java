/*
Programador: Vinicio Lima
Data 20/09/17
Objetivo: Criar e coletar um vetor [100] inteiro e exibir: 
a. O maior e o menor valor; 
b. A média dos valores. 
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex02 {
    
    public static void main(String[] args) {
        
        maiorMenor();        
        
    }
    
    static void maiorMenor(){
        
        int vetorValores[] = new int[50];
        double ac = 0, media = 0, maior = 0, menor = 0;
        int i = 0;        
                
            while(i <= 49){
            vetorValores[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o "+(i+1)+"º número"));
            
            ac += vetorValores[i];            
            
            if (vetorValores[i] > maior){
                maior = vetorValores[i];
            }
            
            if (menor == 0){
                menor = vetorValores[i];
            }
            
            if (vetorValores[i] < menor){
                menor = vetorValores[i];              
            }            
            
             media = ac/5;       
            
            
            i += 1;
        }
        JOptionPane.showMessageDialog(null, "A media é "+media);
        JOptionPane.showMessageDialog(null, "O menor número é :"+menor + "\nMaior número "+maior);
    }    
}
