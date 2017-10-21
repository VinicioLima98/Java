/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência. 
*/
package Exercicios;
import javax.swing.JOptionPane;
public class Lote1Ex47 {
    
    static int base, expo, aux;
    public static void main(String[] args){        
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base: "));
        expo = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do expoente: "));
        aux=base;
        
        exibirCalculoExp();
        
        for(int i=1;i<expo;i++){
            base=base*aux;
        }
        System.out.println("Valor da potência é de: "+ base);
    }
    
    static void exibirCalculoExp(){
        
        for(int i=1;i<expo;i++){
            base=base*aux;
        }
        System.out.println("Valor da potência é de: "+ base);
    }
}
