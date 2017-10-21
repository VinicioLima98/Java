/*******************************************************************************
 * Programador: Vinicio Lima
 * Data: 24/07/17
 * 
 * Objetivo: Receba a hora de início e de final de um jogo (HH,MM) 
 * sabendo que o tempo máximo é de 24 horas 
 * e pode começar num dia e terminar noutro * 
 ******************************************************************************/

package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex25 {
    
    static Integer hrInicial, hrFinal, minInicial, minFinal;
    
    public static void main(String[] args) {
        
        ReceberDados();
        TempoJogoEMostrar();
            
    }
    
    static void ReceberDados(){
        
        hrInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
        hrFinal = Integer.parseInt(JOptionPane.showInputDialog("Qual foi a hora do término do jogo?"));
        minInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do jogo"));
        minFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto do término do jogo"));
        
    }
    
    static void TempoJogoEMostrar(){       
        
        int  hrJogo, minJogo;
        
        
        if (hrFinal < hrInicial) {
            
            hrJogo = (24 - hrInicial) + hrFinal;
        }
        else{
            
            hrJogo = hrFinal - hrInicial;
            
        }
        if (minFinal < minInicial){
            
            minJogo = (60 - minInicial)+ minFinal;
        }
        else{
            
            minJogo = minFinal - minInicial;
                
        }
        if (hrInicial > 24 || hrFinal > 24 || minInicial > 60 || minFinal > 60){
            
            JOptionPane.showMessageDialog(null, "Horário inválido");
                    
        }
        else{
            
            JOptionPane.showMessageDialog(null, "O tempo de jogo foi de: " + hrJogo + " hora(s) e " +  minJogo + " minuto(s)");
                    
        }
    }
}
