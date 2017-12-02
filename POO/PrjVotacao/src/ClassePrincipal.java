/*
Programador: Vinicio Lima
Data: 17/11/17
*/

import java.io.*;
import javax.swing.JOptionPane;


public class ClassePrincipal {
    
    public static void main(String[] args)throws IOException{
        
        int opc =0;
        
        
        Votacao[] vot = new Votacao[100];
        Metodos m = new Metodos();
        
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("-------------------------\n" +
"	Sistema de Votação			                \n" +
"      1 – Carregar Seção/Número Eleitor  	                \n" +
"      2 – Classificar por Seção      		                \n" +
"      3 – Gravar Registros                                	\n" +
"      4 – Mostrar Indicadores                                 \n" +
"      9 – Finalizar                                           	\n" +
"-------------------------"));
            
             switch (opc){
            case 1: vot = m.carregarVotacao(vot);
            
                break;
                
            case 2: vot = m.classificarRegistros(vot);
                
                break;
             
            case 3: vot = m.gravarVotacao(vot);
            
            break;
            
            case 4: m.mostrarMenu(vot);
            
            break;
            
            case 9: JOptionPane.showMessageDialog(null,"Finalizado");
            break;
            default: JOptionPane.showMessageDialog(null,"Opcão invalida");
            
            
            
        }
        
    }

  }
}