package Exercicios;

import javax.swing.JOptionPane;


public class Lote1Ex09

{
    public static void main(String[] args) {
        
        int n1, n2, soma;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira mais um número inteiro: "));
        soma = (n1*n1)+(n2*n2);
        JOptionPane.showMessageDialog(null, "A soma dos números inteiros é: " +soma);
        
    }
}