/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225 
*/
package Exercicios;
public class Lote1Ex48 {
    public static void main(String[] args){        
        
        calcExibirSerie();
        
    }  
    
    static void calcExibirSerie(){
        
        int serie=1;
        int h=1;
        
        for(int i=2;i<=15;i++){
            if(i%2==0){
                h= (-i/(i*i));/*serie = serie +*/ 
            }else{
                serie = serie + (i/(i*i));
            }
        }
        System.out.println("Valor da série é de: "+ serie+ h);
    }
}