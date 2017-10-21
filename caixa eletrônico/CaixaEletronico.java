package caixa.eletronico;

import java.io.*;

public class CaixaEletronico {
	
	static int est[][] = new int[3][4];
	static int cta[][] = new int[1][4];

	public static void main(String[] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int menu=0;
		int notas[][] = new int[2][6];
		int notas_final[][] = new int[2][6];
		notas[0][0]=2;notas[0][1]=5;notas[0][2]=10;notas[0][3]=20;notas[0][4]=50;notas[0][5]=100;
		while(menu!=9){
			System.out.println("Menu Principal\n");
			System.out.println("1-Carregar Notas");
			System.out.println("2-Retirar Notas");
			System.out.println("3-Estatisticas");
			System.out.println("9-Fim");
			menu=Integer.parseInt(in.readLine());
			switch(menu){
				case 1:
					notas=carregar(notas);
					for(int i=0;i<6;i++){
						notas_final[1][i]=notas[1][i];
					}
					break;
				case 2:
					notas_final=retirar(notas_final,notas);
					break;
				case 3:
					mostrar_estatisticas(notas,notas_final);
					break;
				case 9:
					System.out.println("Fim");
					break;
				default:
					System.out.println("Valor Digitado inv�lido");
			}
		}
	}
	
	public static int[][] carregar(int notas[][])throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		for(int i=0;i<6;i++){
			System.out.printf("Insira o numero de notas de %d:\n",notas[0][i]);
			notas[1][i]=Integer.parseInt(in.readLine());
		}
		return notas;
	}
	
	public static int[][] retirar(int notas_final[][],int notas[][])throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("Informe o valor a ser sacado:");
		int saque = Integer.parseInt(in.readLine());
		if(saque<((notas_final[1][0]*2)+(notas_final[1][1]*5)+(notas_final[1][2]*10)+(notas_final[1][3]*20)+(notas_final[1][4]*50)+(notas_final[1][5]*100))){
			System.out.println("Informe o c�digo do banco");
			System.out.println("1-Banco do Brasil");
			System.out.println("2-Santander");
			System.out.println("3-Ita�");
			System.out.println("4-Caixa");
			int menu2 = Integer.parseInt(in.readLine());
			estatisticas(saque,menu2);cta[0][menu2-1]++;
			int notas_saque[] = new int[6]; int notas_saque2[] = new int[5];
			notas_saque = retirada(notas_final,saque,menu2,notas_saque,notas);
			notas_saque2 = retirada2(notas_final,saque,menu2,notas_saque2,notas);
			System.out.println("Escolha uma Op��o:");
			System.out.println("1:\n");
			for(int i=0;i<6;i++){
				if(notas_saque[i]!=0){
					System.out.printf("notas de %d:  %d\n",notas[0][i],notas_saque[i]);
				}
			}
			System.out.println("2:\n");
			for(int i=0;i<5;i++){
				if(notas_saque2[i]!=0){
					System.out.printf("notas de %d:  %d\n",notas[0][i],notas_saque2[i]);
				}
			}
			int escolha = Integer.parseInt(in.readLine());
			if(escolha==1){
				for(int i=0;i<6;i++){
					notas_final[1][i]-=notas_saque[i];
				}
			}else if(escolha==2){
				for(int i=0;i<5;i++){
					notas_final[1][i]-=notas_saque2[i];
				}
			}
		}else{
			System.out.println("EXCEDEU O LIMITE DO CAIXA");
		}
		
		return notas_final;
	}
	
	public static int[] retirada(int notas_final[][],int saque,int menu2,int notas_saque[],int notas[][]){
		if(notas_final[1][5]!=0){
			while(saque>=100){
				notas_saque[5]++;
				saque-=100;
			}
		}
		if(notas_final[1][4]!=0){
			while(saque>=50){
				notas_saque[4]++;
				saque-=50;
			}
		}
		if(notas_final[1][3]!=0){
			while(saque>=20){
				notas_saque[3]++;
				saque-=20;
			}
		}
		if(notas_final[1][2]!=0){
			while(saque>=10){
				notas_saque[2]++;
				saque-=10;
			}
		}
		if((notas_final[1][1]!=0)&&(saque%2!=0)){
			while(saque>=5){
				notas_saque[1]++;
				saque-=5;
			}
		}
		if(notas_final[1][0]!=0){
			while(saque>=2){
				notas_saque[0]++;
				saque-=2;
			}
		}
		return notas_saque;
	}
	
	public static int[] retirada2(int notas_final[][],int saque,int menu2,int notas_saque2[],int notas[][]){
		if(notas_final[1][4]!=0){
			while(saque>=50){
				notas_saque2[4]++;
				saque-=50;
			}
		}
		if(notas_final[1][3]!=0){
			while(saque>=20){
				notas_saque2[3]++;
				saque-=20;
			}
		}
		if(notas_final[1][2]!=0){
			while(saque>=10){
				notas_saque2[2]++;
				saque-=10;
			}
		}
		if((notas_final[1][1]!=0)&&(saque%2!=0)){
			while(saque>=5){
				notas_saque2[1]++;
				saque-=5;
			}
		}
		if(notas_final[1][0]!=0){
			while(saque>=2){
				notas_saque2[0]++;
				saque-=2;
			}
		}
		return notas_saque2;
	}
	
	public static void mostrar_estatisticas(int notas[][],int notas_final[][])throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("Informe o Banco que deseja consultar as estatisticas;");
		System.out.println("1-Banco do Brasil");
		System.out.println("2-Santander");
		System.out.println("3-Ita�");
		System.out.println("4-Caixa");
		int menu = Integer.parseInt(in.readLine());
		for(int i=0;i<3;i++){
			if(i==0){
				System.out.printf("Maior valor de saque banco � %d\n",est[i][menu-1]);
			}else if(i==1){
				System.out.printf("Menor valor de saque banco � %d\n",est[i][menu-1]);
			}else if(i==2){
				est[i][menu-1]=est[i][menu-1]/cta[0][menu-1];
				System.out.printf("M�dia do banco %d\n",est[i][menu-1]);
			}
		}
		for(int i=0;i<6;i++){
			int var=notas[1][i]-notas_final[1][i];
			var=notas[1][i]-var;
			System.out.printf("Valor de notas %d �: %d\n",notas[0][i],var);
		}
	}
	
	public static void estatisticas(int saque,int menu2){
		if(saque>est[0][menu2-1]){
			est[0][menu2-1]=saque;
		}else if((saque<est[1][menu2-1]) || est[1][menu2-1]==0){
			est[1][menu2-1]=saque;
		}
		est[2][menu2-1]+=saque;
	}

}
