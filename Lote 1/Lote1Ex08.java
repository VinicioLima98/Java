package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex08

{
    public static void main(String[] args) {
        
        double dP, media, valMedia;
        
        dP = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito na poupança: "));
        media = dP+(dP*1.3)/100;
        
        JOptionPane.showMessageDialog(null, ("O valor da poupança após de 1 mês de aplicação será de R$")+media);
    }
}