/*
Programador: Vinicio Lima
Data: 21/09/17
Objetivo:Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. 
Calcular e exibir: 
a. A quantidade de cada produto vendido no mês; 
b. A quantidade de produtos vendidos por semana; 
c. O total de produtos vendidos no mês. 
*/
package exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex08 {

	public static void main(String[] args){
		int[][] matriz = new int[4][3];
		matriz=carregar(matriz);
		int soma[] = new int[3];
		soma = mes(matriz);
		int soma2[] = new int[4];
		soma2 = semana(matriz);
		int somatotal = totalMes(matriz);
		for (int i=0;i<3;i++){
			System.out.println("Total mes "+i +"" +soma[i]);
		}
		for (int i=0;i<4;i++){
			System.out.println("Total semana "+ i+""+soma2[i]);
		}
		System.out.println("Soma Total "+somatotal);
		
	}
	
	public static int[][] carregar(int mat[][]){		
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				mat[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Insira um valor "));
			}
		}
		return mat;
	}
	
	public static int[] mes(int mat[][]){
		int soma[] = new int[3];
		for(int j=0;j<3;j++){
			for(int i=0;i<4;i++){
				soma[j]+=mat[i][j];
			}
		}
		return soma;
	}
	
	public static int[] semana(int mat[][]){
		int soma[] = new int[4];
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				soma[i]+=mat[i][j];
			}
		}
		return soma;
	}
	
	public static int totalMes(int mat[][]){
		int soma=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				soma+=mat[i][j];
			}
		}
		return soma;
	}

}