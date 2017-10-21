/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
    sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
*/
package Exercicios;

public class Lote1Ex46 {
    
    public static void main(String[] args){
        double ana = 1.10, maria = 1.5;
       
        
        diferencaIdade(ana, maria);
        
    }
    
    static void diferencaIdade(double ana, double maria){
        int ano = 0;
        
        
        while(ana<maria){
            ana+=0.3;
            maria+=0.2;
            ano++;
        }
        System.out.println("Demorarão: "+ano);
    }
}

