package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex07

{
    public static void main(String[] args) {
        
        int v, c, l, alt;
        
        c = Integer.parseInt(JOptionPane.showInputDialog("Qual é o comprimento do paralelepido?"));
        l = Integer.parseInt(JOptionPane.showInputDialog("Qual é a largura do paralelepido?"));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Qual é a altura do paralelepido?"));
        
        v = c * l * alt;
        
        JOptionPane.showMessageDialog(null,"O volume do paralelepido é " +v + ("cm³"));
    }
}