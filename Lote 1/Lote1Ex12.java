package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex12

{
    public static void main(String[] args) {
        
        int birth, now, sub, fut;
        
        birth = Integer.parseInt(JOptionPane.showInputDialog("Qual foi o ano que você nasceu?"));
        now = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano estamos atualmente?"));
        
        sub = now - birth;
        fut = sub + 17;
        
        JOptionPane.showMessageDialog(null, "A sua idade atual é: "+sub + "\n Em 17 anos, você terá: "+fut + (" anos"));
        
    }
}