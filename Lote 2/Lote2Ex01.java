/***
 * Programador: Vinicio Lima
 * Data 20/09/17
 * objetivo: Criar e coletar um vetor [50]. Calcular e exibir:
 * a. A média dos valores entre 10 e 200; b. A soma dos números ímpares.
 */

package Exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex01 {
    
    public static void main(String[] args) {     
        
        mediaSoma();        
            
    }
    
    static void mediaSoma(){
        
        int vetorValores[] = new int[50];
        double media = 0;
        int soma = 0, i, cont = 0, resto;
        
        for (i = 0; i <= 49; i++){
            
            vetorValores[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
            
            if ((vetorValores[i] > 10) && (vetorValores[i]<200)){
                
                    media = media + vetorValores[i];
                    cont += 1;
            }
            
            resto = (vetorValores[i] % 2);
            
            if (resto != 0) {
                soma += vetorValores[i];
            }            
        }
        
        media = media / cont;
        System.out.println(media +"\n"+soma);
        
    }
}
