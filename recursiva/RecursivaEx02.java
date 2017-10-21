/*
* Programador: Vinicio Lima
* Data: 20/09/17
*/

package Exercicios;

import javax.swing.JOptionPane;

public class RecursivaEx02 {
    
    public static void main(String[]args){   
    
    
        int numInt;
        boolean segue;
    
        do{
        
            numInt = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        
            if ((numInt >= 3) && (numInt <=10)){
            
                segue = true;
        
            }
            else{         
            
                JOptionPane.showMessageDialog(null, "Número inválido. Insira um novo valor, por favor");           
                segue = false;
            }
        
        }while(segue == false);
        
        System.out.println("2.1) \nS = " +fRecursivaSubtracao(numInt));
        
        
           
    }
    
    static int fRecursivaSubtracao(int num){
        
        int sub=0;
        
        if (num == 1){
            return num;
        }
        else{
            sub++;
            num += fRecursivaSubtracao(num-sub);
            return num;
        }
    }
    
    
}
