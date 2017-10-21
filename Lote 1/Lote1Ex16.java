/*
Programador: VInicio Lima
Data: 24/08/17

Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, 
o percentual de desconto e o número de descendentes. 
Calcule o salário que serão as horas trabalhadas x o valor por hora. 
Calcule o salário líquido (= Salário Bruto – desconto). 
A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber
*/
package Exercicios;
import javax.swing.JOptionPane;
public class Lote1Ex16

{
    static Double hrsTrab, valHr, percDesc, desc, sal_bruto, sal_liq;
    
    
    public static void main(String[] args) {
        
        ReceberDados();
        CalculoSalario();
        JOptionPane.showMessageDialog(null, "O salário a ser recebecido será de " + sal_liq + " reais");       
        
        
    }    
/*******************************************************************************
 *   Procedimento criado para coletar os seguintes dados:
 *   - Horas trabalhadas
 *   - Valor hora trabalhada
 *   - Percentual de desconto
 *   - Número de descendentes
********************************************************************************/    
    static void ReceberDados()
    {    
    
        hrsTrab = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a quantidade de horas trabalhadas?"));
        valHr = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor por hora?"));
        percDesc = Double.parseDouble(JOptionPane.showInputDialog("Qual é o percentual de desconto? "));
        desc = Double.parseDouble(JOptionPane.showInputDialog("Qual é o número de descendentes?"));
    }
    
    /***************************************************************************    
    * Procedimento com os calculos de:
    * - Salário bruto
    * - Horas trabalhadas
    * - Descendentes
    * - Salário liquido.    
    ****************************************************************************/
    
    static void CalculoSalario()
    {
        sal_bruto = (hrsTrab * valHr);
        desc = (desc * 100);
        sal_liq = (sal_bruto-(sal_bruto *(percDesc)/ 100) +(desc));
        
    }    
   
    
}