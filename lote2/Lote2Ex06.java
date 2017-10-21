/*
Programador: Vinicio Lima
Data 21/09/17
Objetivo: Criar e coletar em um vetor [20] com números aleatórios. 
Classificar este vetor em ordem crescente e mostre os dados. 
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex06 {
    
    public static void main(String[]args){
        
        int v[] = new int[20];
        int opc = 0;
        
        
            v = funcaoCarrega(v);               
                    
            v = funcaoClassifica(v);                
                    
            procedimentoMostra(v);       
                    
           
    }
    
    static int[] funcaoCarrega(int v[]){
        
            int i;
                
            for (i = 0; i <= 19; i++){
                v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (i+1) + "o número"));
            }               
                
            return v;                  
    }
        
    static int[] funcaoClassifica(int v[]){
            int i, j, aux;
            
            for (i = 0; i < 18; i++){
                for (j = i + 1; j < 19; j++){
                    if(v[i] > v[j]){                  
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                    }
                }
            }
    return v;
        }
        
    static void procedimentoMostra(int v[]){
            System.out.println("O vetor é");
            for (int i = 0; i < 19; i++){
                System.out.println(v[i]);
            }
        }
}
