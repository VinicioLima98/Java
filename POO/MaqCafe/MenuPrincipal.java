/*
Programador: Vinicio Lima
Data: 05/11/2017
*/

package teste;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
public class MenuPrincipal {
    
    static int moedasMaquina[] = new int[5];
    static int moedasCliente[]= new int[5];
    
    static ClasseMetodos m;
    static MetodoMoedas moedas;
    
    public static void main(String[] args) { 
             
        m = new ClasseMetodos();
        
        iniciarCaixa();       
        
        DecimalFormat formato = new DecimalFormat("0.00");
        
        
        m.setCafeCurto(0.70f);
        m.setCafelongo(0.65f);
        m.setCafeComLeite(0.80f);
        m.setCapuccino(0.80f);
        m.setMocaccino(0.90f);
        m.setChocolateQuente(0.75f);
        m.setCha(0.55f); 
        
        moedas = new MetodoMoedas();
        
        moedas.setMoeda5(0.05f);
        moedas.setMoeda10(0.10f);
        moedas.setMoeda25(0.25f);
        moedas.setMoeda50(0.50f);
        moedas.setMoeda100(1.00f);
        
        
        int opc;
        boolean cont = false;       
            
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu \n-------------------------- \n1) Café Curto \n2) Café Longo"+
                    "\n3) Café com Leite \n4) Capuccino \n5) Mocaccino"+
                    "\n6) Chocolate Quente \n7) Chá \n  "));
            
            switch (opc){
                
                case 1: m.preço = m.getCafeCurto();
                cont = true;
                    break;
                    
                case 2: m.preço = m.getCafeComLeite();
                cont = true;                    
                    break;
                
                case 3: m.preço = m.getCafeComLeite();
                cont = true;
                    
                    break;
                
                case 4: m.preço = m.getCapuccino();
                cont = true;                    
                    break;
                
                case 5: m.preço = m.getMocaccino();
                cont = true;                    
                    break;
                
                case 6: m.preço = m.getChocolateQuente();
                cont = true;                    
                    break;
                
                case 7: m.preço = m.getCha();
                cont = true;                    
                    break;
                
                default: JOptionPane.showMessageDialog(null, "Valor invalido");
                }
        }while(cont == false);           
            
            
            boolean continua = false;
            String acucar = null;            
            
            do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1) Com mais açucar \n2) Com açucar \n3) Sem açucar "));
        switch (opc){            
        
            case 1: acucar = "Com mais Açucar";
            continua = true;
            break;
            
            case 2: acucar = "Com açucar"; 
            continua = true;
            break;
            
            case 3: acucar = "Sem açucar";
            continua = true;
            break;
            
            default: JOptionPane.showMessageDialog(null, "Selecione uma opção de açucar");
        }
        
        }while(continua != true);
            
                        
            JOptionPane.showMessageDialog(null, "Menu \n1) Café Curto \n2) Café Longo"+
                    "\n3) Café com Leite \n4) Capuccino \n5) Mocaccino"+
                    "\n6) Chocolate Quente \n7) Chá \n"+acucar+"\n-------------------\nValor inserido: R$ 0.00 "
                    + "\nPreço: R$" +(formato.format(m.getPreço()).replace(",",("."))) +"\nTroco: R$0.00");
            
            
            boolean cancelado = false;
            
            while(true){
                try {            
                    
                    
                    int moeda = Integer.parseInt(JOptionPane.showInputDialog("\nPagamento \n----------- \nMoedas aceitas: \n5 centavos \n10 centavos "+
                            "\n25 centavos \n50 centavos \n1 real \n----------- \nValor inserido R$:"+(formato.format(checaPreco()).replace(",",(".")))+ "\nPreço a pagar: R$"
                            +(formato.format(m.getPreço()).replace(",",(".")))));
                    
                    insercaoCliente(moeda);
                    
                    
                    
                    if(checaPreco() >= m.preço){
                        break;          
                    }
                    
                } catch (Exception e) {
                    cancelado = true;
                    break;
                    
                }
                
            } 
            
            System.out.println(checaPreco());
            
            float totalMaquina, totalCliente, troco;
            
            
            if(cancelado){
                JOptionPane.showMessageDialog(null, "Operação cancelada. Suas moedas foram devolvidas");
            }else{
                


                if (valorMaquina() > checaPreco()){

                   totalMaquina = valorMaquina();
                   totalCliente = checaPreco();
                   if(totalCliente == m.getPreço()){
                       JOptionPane.showMessageDialog(null, "Produto liberado");

                       creditarMaquina();

                   }else if(totalCliente > m.getPreço()){
                       troco = totalCliente - m.getPreço();
                       JOptionPane.showMessageDialog(null, "Produto liberado");
                       JOptionPane.showMessageDialog(null, "Seu troco é: R$"+(formato.format(troco).replace(",",("."))));

                       creditarMaquina();
                   }



                }else{
                    JOptionPane.showMessageDialog(null, "Não há troco na máquina");

                }
            
            }
            
    
           }
    
    public static void creditarMaquina(){
        for(int i = 0; i < moedasMaquina.length; i++){
            moedasMaquina[i] += moedasCliente[i];
        }    
        
    }
    
    
    public static void insercaoCliente(int indice){          
        
         switch (indice){
            case 5: moedasCliente[0]++;                
                break;                
            case 10: moedasCliente[1]++;
                break;                
            case 25: moedasCliente[2]++;
                break;
            case 50: moedasCliente[3]++;
                break;
            case 1: moedasCliente[4]++;
                break;
        }
        
    }
    
        public static int valorMaquina(){
        int i, soma = 0;
        for (i = 0; i <= 100; i++){       
        switch (i){
                case 0: soma += moedasMaquina[i]* moedas.getMoeda5();

                    break;
                case 1: soma += moedasMaquina[i]* moedas.getMoeda10();
                    break;

                case 2: soma += moedasMaquina[i]* moedas.getMoeda25();
                    break;
                case 3: soma += moedasMaquina[i]* moedas.getMoeda50();
                    break;
                case 4: soma += moedasMaquina[i]* moedas.getMoeda100();
                    break;
            }        
        }        
        return soma;
        }
    
    
      public static void iniciarCaixa(){
          Random r = new Random();            
          for(int i=0; i<moedasMaquina.length; i++){
              moedasMaquina[i] = r.nextInt(101);
          }
          for(int i : moedasMaquina){
              System.out.println(i);
          }
    
    }
      
     public static float checaPreco(){
         float valorInsert = 0f;
         
         for(int i=0; i<moedasCliente.length; i++){
            switch (i){
                case 0: valorInsert += moedasCliente[i]* moedas.getMoeda5();

                    break;
                case 1: valorInsert += moedasCliente[i]* moedas.getMoeda10();
                    break;

                case 2: valorInsert += moedasCliente[i]* moedas.getMoeda25();
                    break;
                case 3: valorInsert += moedasCliente[i]* moedas.getMoeda50();
                    break;
                case 4:valorInsert += moedasCliente[i]* moedas.getMoeda100();
                    break;
            }
         }
         
         return valorInsert;
         
     }   
    
}
