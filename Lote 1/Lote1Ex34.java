/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150
*/
package Exercicios;

public class Lote1Ex34 {
    
    public static void main(String[] args) {
        
        CalculoExibir();       
        
    }
    static void CalculoExibir(){
            
        int contador, acumulador;        
               
        contador = 9;
        acumulador = 0;
        
        while (contador <= 150) {
            
            System.out.println(acumulador);
            contador += + 1;
            acumulador = contador * contador;
        } 
    }
    
}
