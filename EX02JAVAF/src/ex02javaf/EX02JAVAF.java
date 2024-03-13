/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02javaf;



import java.util.Scanner;

/**
 *
 * @author henri
 */
public class EX02JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int anoAt=2023, anoNasc, mesAt=4, mesNasc, meses=12;
        

        System.out.println("Qual seu ano de nascimento?");
        anoNasc = teclado.nextInt();
        
        System.out.println("Qual o mês de nascimento?");
        mesNasc = teclado.nextInt();
        
        int idade = anoAt-anoNasc;
        int mesidade = meses-(mesNasc-mesAt);
        
        if(mesidade > 0){
        idade--;
        }
        if (mesidade>12) {
            idade++;
            mesidade = mesidade-meses;
        }
        System.out.println(idade);
        if (idade>=18) {
            if (mesidade > 0) {
                System.out.println("VOCÊ ESTÁ APTO PARA DIRIGIR " + idade + " anos e " + mesidade + " meses ");
            }
        }
        else{
                System.out.println("VOCÊ NÃO ESTÁ APTO PARA DIRIGIR " + idade + " anos e " + mesidade + " meses ");
            }
        
        
        

    }
    
}
