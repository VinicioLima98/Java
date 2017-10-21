/*
    Nome do programador: Vinicio Lima
    Data da elaboração: 10/08/2017
    Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados. 
*/
package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex32 
{
        
    public static void main (String args[]){        
        
        SwitchCaseInvestimento();        
    
    }
    
    static void SwitchCaseInvestimento(){
        
        int n;
        double valorInvest;
    
    n = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Poupança " + "\nDigite 2 para Renda Fixa"));
    
        switch (n)
        {        
        case 1:
                      
            valorInvest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento "));
            
            valorInvest = (valorInvest * 0.03) +valorInvest;
            
            JOptionPane.showMessageDialog(null, "O valor após a correção é de " + valorInvest);
            
            break;
            
        case 2:
            
            valorInvest= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
            
            valorInvest = ((valorInvest * 0.05) + valorInvest);
            
            JOptionPane.showMessageDialog(null, "O valor após a correção é de " + valorInvest);
            
            break;
            
        default:
            JOptionPane.showMessageDialog(null,"O número digitado não é válido");
        }
        
    }
    
}
    
    

