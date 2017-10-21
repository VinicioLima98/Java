/*
* Programador: Vinicio Lima
* Data: 24/08/17
*
* Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau
* da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais
* e se caso exista, calcule e mostre.
*
*/


package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex20 {
    
    static Integer a, b, c;
    
    public static void main(String[] args) {    
            
        
       ReceberDados();
       CalculoBhaskara();     
        

    }    
    /*
    * Recebe o valor de A, B, C do usuário
    */
    static void ReceberDados()
    {
      
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));  
    }    
    
    /*
    * Utiliza a formula de Bhaskara e exibe as duas raízes
    * OBS: Quando o delta for negativo, as raízes não serão calculadas.
    */    
    static void CalculoBhaskara()
    {
        double delta, x1, x2;
        ;
     delta = (b *b) + (-4)*a*c;
        
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta))/(2 * a);
            x2 = (-b - Math.sqrt(delta))/(2 * a);
            
            JOptionPane.showMessageDialog(null, "O valor de X1 é: "+ x1 + "\n O valor de X2 é: "+ x2 );
        }
           
        else{            
            JOptionPane.showMessageDialog(null, "O número pertence aos imaginários.");
        }   
    }
}
