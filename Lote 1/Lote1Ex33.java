/*  
    Nome do programador: Vinicio Lima
    data da elaboração: 14/09/2017
    Objetivo: Receba a data de nascimento e atual em ano, mês e dia. 
    Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos. 
*/

package exercicios;

import java.util.Scanner;

public class Lote1Ex33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, diaInicial, mesInicial, anoInicial, diaFinal, mesFinal, anoFinal;
		Lote1Ex33 function = new Lote1Ex33();
	
		System.out.println("Digite o dia, mês e ano:");
		diaInicial = sc.nextInt();
		
		mesInicial = sc.nextInt();
		anoInicial = sc.nextInt();
		
		System.out.println("Digite o dia, mês e ano atual:");
		diaFinal = sc.nextInt();
		mesFinal = sc.nextInt();
		anoFinal = sc.nextInt();
		
		System.out.println(function.datas(diaInicial, mesInicial, anoInicial, diaFinal, mesFinal, anoFinal));

	}

	public String datas(int diaIni, int mesIni, int anoIni, int diaFim, int mesFim, int anoFim){
		int i, ano, mes, dia, bis = 0;
		int quantDias[] = new int[12];
		
		for(i=1;i<12;i++){
			if(i == 2){
				quantDias[i] = 28;
			}else if(i == 4 || i == 6 || i == 9 || i ==11){
				quantDias[i] = 30;
			}else{
				quantDias[i] = 31;
				
			}
		}	
		ano = (anoFim - anoIni);
		mes = (mesFim - mesIni);
		
		if(mes < 0){
			ano = (ano -1);
			mes = (mes + 12);
		}
		
		dia = (diaFim - diaIni);
		if(dia < 0){
			mes = (mes - 1);			
			if (mes < 0){
				ano = (ano - 1);
				mes = (mes + 12);
			}
			dia = dia + quantDias[mes];
		}
		
		for(int c = anoIni; c<=anoFim;c++){
			if(c % 4 == 0){				
				bis = (bis+1);		
				
			}				
		}		
		return "Se passaram: "+ano + " anos "+ mes +" meses " + (dia + bis) + " dias ";
	}
}
