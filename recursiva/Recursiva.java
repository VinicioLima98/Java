package Exercicios;

import javax.swing.JOptionPane;

public class Recursiva {
    
    public static void main(String[] args) {
        
       int nro;
   
       nro = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
    
    JOptionPane.showMessageDialog(null,fRecursivo(nro));
}
    
    static int fRecursivo(int num){
        int x;
        
        if(num == 1){
            return num;
        }
        else{
           x= num*fRecursivo(num-1); 
            return x;
        }
            
    }
    
}
