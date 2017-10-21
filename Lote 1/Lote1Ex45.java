/*
    Nome do programador: Vinicio Lima
    data da programação: 17/08/2017
    Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 
*/

package Exercicios;

public class Lote1Ex45 {
    
    public static void main(String[] args) {        
       
        exibirSerie();
        
    }
    static void exibirSerie(){
        
        int i, j, k = 1;
        
        System.out.println("1");        
        
        for (i = 2; i <= 50; i++){
            
            j = i;
            j += k;
            k = i;
            
            System.out.println(i+"/"+j);
        }
    }
    
}
