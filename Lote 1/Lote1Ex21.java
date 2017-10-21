/*******************************************************************************
 *  Programador: Vinicio Lima
 *  Data: 24/08/17
 *  
 * Objetivo: Receba 4 notas bimestrais de um aluno. 
 * Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média: 
 *  a. Se a média for >= 6,0 exibir “APROVADO”; 
 *  b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”; 
 *  c. Se a média for < 3,0 exibir “RETIDO”
*******************************************************************************/

package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex21{
    
    static double n1, n2, n3, n4, media;
    
    
    public static void main(String[] args) {
        
        ReceberDados();
        media = FuncaoMedia(n1, n2, n3, n4);
        MediaFinal();  
            
    
    }
    
    
    static void ReceberDados(){    
       
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota"));
        
    }
    
    static Double FuncaoMedia(Double n1, double n2, double n3, double n4)
    {     
       
       media =  (n1 + n2 + n3 + n4)/4;
       
      return media;
    }
    
    static void MediaFinal(){
        
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado");                        
        }
        else if(media >= 3){ 
            JOptionPane.showMessageDialog(null, "Exame");
        }
        else {
            JOptionPane.showMessageDialog(null, "Retido");
            
        } 
        
    }
    
}