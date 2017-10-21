/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
*/

package Exercicios;

public class Lote1Ex44 {
    
    
    public static void main(String[] args) {
        
        int num1 = 1, num2 = 6;
        
        exibirNum(num1, num2);
        
    }
    
    static void exibirNum(int num1, int num2){
        while (num1 <= 6){
            
            num1 += 1;
            num2 -= 1;
            
            System.out.println(num1 +"+"+ num2 + "="+7);
        }
        
    }
    
}
