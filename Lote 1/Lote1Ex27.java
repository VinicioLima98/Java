/*******************************************************************************
 * Programador: Vinicio Lima
 * Data: 24/08/17
 * 
 * Objetivo: Receba o número de voltas, a extensão do circuito (em metros)
 * e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.  
 ******************************************************************************/

package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex27 {
    
    static Double voltas, circ, tempo;
    
    public static void main(String[] args) {        
             
        ReceberDados();
        FuncaoVelMedia(voltas, circ, tempo);
        
        JOptionPane.showMessageDialog(null, "A velocidade média é: " +FuncaoVelMedia(tempo, voltas, circ));
    }
    
    static void ReceberDados(){
        
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas"));
        circ = Double.parseDouble(JOptionPane.showInputDialog("Qual é a extensão do circuito em metros?"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o tempo gasto em minutos?"));
        
    }
    
    static double FuncaoVelMedia(double voltas, double circ, double tempo){        
         
        double velMedia;
        
        tempo = (tempo) * 60;
        velMedia = (voltas * circ/(tempo)) * 3.6;        
        
        return velMedia; 
    }
    
}
