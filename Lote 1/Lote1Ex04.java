package Exercicios;

import javax.swing.JOptionPane;

public class Lote1Ex04

{
    public static void main (String args[]){
        
        int celsius, fahrenheit;
        
        celsius = Integer.parseInt(JOptionPane.showInputDialog("Qual é a temperatura em Graus Celsius?"));
        fahrenheit = ((9*celsius)+160)/5;
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é " +fahrenheit);
    }
}
