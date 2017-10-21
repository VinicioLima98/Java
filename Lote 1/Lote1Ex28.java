/*
    Nome do programador: Vinicio Lima
    data da elaboração: 10/08/2017
    Objetivo:Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: 
    Venda Mensal Preço Atual Preço Novo < 500 < 30 + 10% >= 500 e < 1000 >= 30 e < 80 +15% >= 1000 >= 80 - 5% 
    Obs.: para outras condições, preço novo será igual ao preço atual. 
*/

package Exercicios;

import javax.swing.JOptionPane;
        
public class Lote1Ex28 {
    
    static Double preçoAT, vendaMensal;
    
    public static void main(String[] args) {
        
    ReceberDados();
    FuncaoCondiçoesPreçoEVenda(preçoAT, vendaMensal);   
   
    JOptionPane.showMessageDialog(null, "O novo preço será no valor de R$"+ FuncaoCondiçoesPreçoEVenda(preçoAT, vendaMensal));
    }
    
    static void ReceberDados(){
        
        preçoAT = Double.parseDouble(JOptionPane.showInputDialog("Qual é o preço atual?"));
        vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Qual é a media mensal do produto?"));
        
    }
    
    static double FuncaoCondiçoesPreçoEVenda(double preçoAT, double vendaMensal){
        
        double preçoFinal = 0;
        
        if ((vendaMensal < 500) && (preçoAT < 30)){
        
        
        preçoFinal = preçoAT + (preçoAT * 0.10);
        
              
        }
        else if ((vendaMensal >= 500) && (preçoAT >= 30) 
                    && (preçoAT < 80)){        
        
            preçoFinal = preçoAT + (preçoAT * 0.10);
            
        }
        else if ((vendaMensal >= 1000) && (preçoAT >= 80)){        
        
            preçoFinal = (preçoAT + (preçoAT * 0.05));
            
        }
    return preçoFinal; 
    }
}
