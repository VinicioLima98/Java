import javax.swing.*;
import java.io.*;
import java.util.Random;

public class Metodos {
    int secao [] = new int [10];
    int candidato [] = new int [300];
    public Votacao[] carregarVotacao (Votacao[] vot)throws IOException {
        Random gerador = new Random();
        
        for (int i = 0; i < vot.length; i++){
            vot[i]= new Votacao();
            
        }
        
        for (int i = 0; i< 100; i++){
            vot[i].numero_secao = gerador.nextInt(10);
            vot[i].numero_candidato = gerador.nextInt(301);
            
        } 
        return vot;
    }

    public Votacao[] classificarRegistros(Votacao[] vot)throws IOException {
        
        
        //auxiliar para clissificação
        Votacao[] aux = new Votacao[1];
        
        for(int i = 0; i<100; i++){
           for(int j = 0; j<100; j++){
               if(vot[i].numero_secao>vot[j].numero_secao){
                   aux[0] = vot[i];
                   vot[i] = vot[j];
                   vot[j] = aux[0];
                   
               }
           } 
        }
        
        return vot;
    }
    
    
    public Votacao[] gravarVotacao (Votacao[] vot)throws IOException {
        String fileName = "Votacao.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        
        for (int i =0; i<100; i++){
            writer.write (Integer.toString(vot[i].numero_secao));
            writer.newLine();
            writer.write (Integer.toString(vot[i].numero_candidato));
            writer.newLine();
            
        }
        writer.close();
        JOptionPane.showMessageDialog(null,"Arquivo gerado com sucesso!");
        return vot;
    }
    
    public void  mostrarMenu (Votacao[]vot)throws IOException {
        
        int  opcao_mostra=0;
        
        while(opcao_mostra != 9){
            opcao_mostra = Integer.parseInt(JOptionPane.showInputDialog("-----------------------------------------------------------------------\n" +
"	    Mostrar Indicadores			                   \n" +
"        Estatísticas de Votação em 2016		           \n" +
"  1 – Quantidade Eleitores por Seção	                           \n" +
"  2 –Seção com Maior e Menor número de Eleitores                 \n" +
"  3 – Quantidade de votos por candidato                          \n" +
"  4 – 10 primeiros colocadas (nro  cand. e qtd votos )           \n" +
"  9 – Finaliza consulta	                		   \n" +
"------------------------------------------------------------------------"));
                
                switch (opcao_mostra){
                    case 1: qtd_Por_Secao(vot);
                    break;
                    case 2: maior_Menor(vot);
                    break;
                    case 3: votos_Por_Candidato(vot);
                    break;
                    case 4: primeiros_colocados(vot);
                    break;
                    case 9: JOptionPane.showMessageDialog(null,"Finalizado! ");
                    break;
                    default: JOptionPane.showMessageDialog(null,"Invvalido!");
                }
                
            
        
        
        }
    }
    public void qtd_Por_Secao (Votacao[]vot)throws IOException {
        int i;
        
        
        lerArquivo(vot);
        
        for ( i=0; i<100 ; i++){
           secao[vot[i].numero_secao]++;
        }
        
        i = 0;
        while (i<10){
            System.out.println("na seção"+i+"° teve "+secao[i]+" eleitores");
          
         i++;   
        }
        
    }
    
    
        public void maior_Menor(Votacao[]vot) throws IOException{
            int maior = secao[0];
            int menor = secao [0];
            int cont = 1, mostra_maior = 0 , mostra_menor = 0;
            
            
            
        while (cont<10){
            if(secao[cont]<menor){
               menor = secao[cont];
                mostra_menor = cont;
            }
            if(secao[cont]>maior){
                maior = secao[cont];
                mostra_maior = cont;
            }
            cont++;
        }
        
        JOptionPane.showMessageDialog(null,"A secão com maior número de votos foi a"+mostra_maior +"° com "+maior+"");
        JOptionPane.showMessageDialog(null,"A secão com menor número de votos foi a"+mostra_menor +"° com "+menor+"");
    }
        
        public void votos_Por_Candidato(Votacao[]vot) throws IOException{
        
            for (int i = 0; i< 100; i++){
                candidato[vot[i].numero_candidato] = candidato[vot[i].numero_candidato] + 1;
            }
            
            for(int i = 0; i< 300; i++){
                System.out.println("O candidato"+ i + " teve "+ candidato[i]+" votos");
            }
    }
        
        public void primeiros_colocados (Votacao[]vot)throws IOException{
            int primeiros [] = new int [10];
            int j = 0,aux,aux_troca;
            
            
            for (int i = 0; i<10 ; i++){
                primeiros[i] = 0;
            }
            
            for (int i=0 ; i<300 ; i++){
                j=0;
                if (candidato[i]>primeiros[j]){
                    aux = primeiros[j];
                    primeiros[j] = candidato[i];
                    
                    while(j<8){
                        aux_troca = primeiros[j+1];
                        primeiros[j+1] = aux;
                        primeiros[j+2]= aux_troca;
                        j++;    
                    }
                }
                
                
            }
            for (int i = 0 ; i < 10 ; i ++){
                 j = i+1;
            JOptionPane.showMessageDialog(null,"O "+ j + "° colocado tem "+ primeiros[i] + " votos");
            }
        }
    
    
    
    
    
    
    
      public Votacao[] lerArquivo (Votacao[]vot) throws IOException{
        
        int i;
         String fileName = "Votacao.txt";        
        
         BufferedReader ler = new BufferedReader(new FileReader(fileName));
         
         for (i=0; i<100; i++){
             vot[i]=new Votacao();
         }
         
         for(i=0; i<100; i++){
             vot[i].numero_secao = Integer.parseInt(ler.readLine());
             vot[i].numero_candidato = Integer.parseInt(ler.readLine());
         }
        return vot;
        
    }
}
