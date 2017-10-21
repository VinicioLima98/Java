package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex13

{
    public static void main(String[] args) {
        
        int kg, g, dias;
        
        kg = Integer.parseInt(JOptionPane.showInputDialog("Quantos kilos de alimento você deseja calcular?"));
        kg = kg * 1000;
        g = 50;
        dias = kg/g;
        
        JOptionPane.showMessageDialog(null, ("O alimento durará ") +dias + (" dias"));
    }
}