/*
Programador: Vinicio Lima
Data: 24/09/17
Objetivo: Efetuar busca binária em um vetor de 20 posições divergentes
*/

package Exercicios;

import javax.swing.JOptionPane;

public class Lote2Ex07 {
	
	static boolean pesquisar;
	
	public static void main(String[] args){
		
		int vetor[] = new int[20];
		for(int i=0;i<20;i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o"+(i+1)+"º número")); 	
		}
		vetor=organizar(vetor);		
		int pesq = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor deseja pesquisar?"));
		pesquisar=false;
		int meio=procurar(vetor,pesq);
		if(pesquisar==true){
			JOptionPane.showMessageDialog(null, "valor existe, na posicao:" + " " + meio);
		}else{
			JOptionPane.showMessageDialog(null, "valor não existe no vetor");
		}
	}
	
	public static int[] organizar(int vetor[]){
            for(int i=0;i<20;i++){
		for(int j=0;j<20;j++){
                    if(vetor[j]>vetor[i]){
                        
			int k = vetor[i];
			vetor[i]=vetor[j];
                        vetor[j]=k;
				}		
			}
		}
            return vetor;
	}
	
	public static int procurar(int vetor[], int pesq){
		int maior=19,menor=0;
		int meio=(maior+menor)/2;
		while(menor<=maior){
			if (pesq==vetor[meio]){
				pesquisar=true;
				return meio;
			} else if (vetor[meio]<pesq){
				menor=meio+1;
			} else {
				maior=meio-1;
			}
			meio=(maior+menor)/2;
		}
		pesquisar=false;
		return meio;
	}
	
}
    

