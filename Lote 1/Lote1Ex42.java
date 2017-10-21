/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: 
Casa: 1 2 3 4 ... 64 Qte: 1 2 4 8 ... N
*/
package Exercicios;

public class Lote1Ex42 {
    
    public static void main(String[] args) {
   
      double quant = 0;
      int i = 0;
      
      exibirCalculo(quant, i);
      for (i = 1; i <= 64; i++)
      {
          
          quant = Math.pow(2, i);
          
          System.out.println("casa" + i);
          System.out.println("\n Quantidade" + quant);
      }
}
    static void exibirCalculo(double quant, int i){
        for (i = 1; i <= 64; i++)
      {
          
          quant = Math.pow(2, i);
          
          System.out.println("casa" + i);
          System.out.println("\n Quantidade" + quant);
      }
    }
    
}
