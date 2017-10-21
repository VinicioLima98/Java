/*
    Nome do programador: Vinicio Lima
    data da elaboração: 17/08/2017
    Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
*/

package Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lote1Ex43 {
    
    public static void main(String[] args) {
        
		Lote1Ex43 func = new Lote1Ex43();
		Scanner entrada = new Scanner(System.in);
		int num, num2, j=1 ,c=0;
		System.out.println("Digite o Primeiro valor: ");
		num = entrada.nextInt();
		System.out.println("Digite o Seguno valor: ");
		num2 = entrada.nextInt();
		System.out.println("Os números primos são: " + func.primos(num, num2, j, c));

	}
	
	public String primos(int num, int num2, int j ,int c){
		
            if(num>num2){
                while(num2<=num){
                    while(j<= num2){
			if(num2%j==0){
                            c++;
			}
                            j++;
                    }
			
            if(c==2){
		System.out.println("Os Números primos são: " + num2);
            }
		num2++;
		j = 1;
		c = 0;							
		}
			
            }else{
                while(num2>=num){
                    while(j<= num){
			if(num % j == 0){
                            c++;
			}
                            j++;
                    }
            if(c == 2){
		System.out.println("Os Números primos são: " + num);
            }
		num++;
		j = 1;
		c = 0;
		}
            }
            return ("");
		
	}
}
        
    
    

