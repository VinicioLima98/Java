/*******************************************************************************
* Programador: Vinicio Lima
* Data 24/08/17
*
* Objetivo: Calcule a quantidade de litros gastos em uma viagem,
* sabendo que o automóvel faz 12 km/l. 
* Receber o tempo de percurso e a velocidade média
********************************************************************************/


package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex17 {
    
    static Double t, media;
    static Integer litro;
    
    public static void main(String[] args) {
        
        double quant_litros = 0;
        ReceberDados();
        quant_litros = FuncaoCalculo(litro, quant_litros, media, t);
        
        JOptionPane.showMessageDialog(null, "Foram utlizados "+quant_litros + (" litros de combustível durante a viagem."));
    }

    /* 
    Função criada com o objetivo de calcular a quantidade de litros
    */
    
    static double FuncaoCalculo(int litro, double quant_litros, double media, double t)
    {     
    
        litro = 12;
        quant_litros = (media * t)/litro;    
             
        
        return quant_litros;
      
    }
    
    /*
    Procedimento para receber dados do usuário
    */
    
    
    static void ReceberDados()
    {
        t = Double.parseDouble(JOptionPane.showInputDialog("qual foi o tempo gasto no percurso da viagem?"));
        media = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a velocidade média do carro?"));
    }
}
