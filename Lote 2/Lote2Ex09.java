/*
Programador: Vinicio Lima
Data: 21/09/17
Objetivo: Criar e carregar uma matriz [4][4] com valores aleatórios, 
sendo que a diagonal principal terá seus dados carregados no programa segundo: 
*/
package exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex09 {

	public static void main(String[] args){
            
            int i, j;
            
            int matriz[][] = new int[4][4];
            
		matriz = carregarMatriz(matriz);
                
		for(i = 0;i < 4; i++){
			for(j = 0;j < 4;j++){
                            
                            System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println(" ");
		}	
	}
        
	public static int[][] carregarMatriz(int matriz[][]){
            
            int i, j;
            
		for(i = 0; i < 4; i++){
                    for(j = 0; j < 4; j++){
			if(i == j){
                            
                            matriz[i][j] = (int) Math.pow(4, i);
                            
			}else{
                            
                            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
			}
                    }
		}		
		return matriz;
	}

}
    