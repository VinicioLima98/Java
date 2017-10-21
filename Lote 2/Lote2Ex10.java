/*
Programador: Vinicio Lima
Data: 21/09/17
Objetivo: Criar uma matriz [8][8] onde o programa irá carregar segundo: 
*/

package exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex10 {

	public static void main(String[] args){
            
		int mat[][] = new int[2][8];
		int soma = preencherMatriz(mat);
		JOptionPane.showMessageDialog(null, soma);
	}
	
	public static int preencherMatriz(int mat[][]){
            
		mat[0][0]=1;
		mat[1][0]=1;
		int soma= mat[1][0];
                
		for(int j = 1; j < 8; j++){
                    for(int i = 0; i < 2; i++){
			if(i==1){
                            
                            mat[i][j]= mat[i][j-1]+ mat[i][j-1];
                            soma+= mat[i][j];
                        }
                        else
                        {
                            mat[i][j]= j+1;
			}
						
                    }
		}
		return soma;
	}

}