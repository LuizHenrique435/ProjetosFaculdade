/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07javaf;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class EX07JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2;
        String operacao=null;
        
        System.out.println("Informe um numero");
        n1=teclado.nextInt();
        System.out.println("Informe um numero");
        n2=teclado.nextInt();
        
        
        
        if(n1==00 || n2==0){
            
        }
        else
        {
            
        System.out.println("INFORME A OPERAÇÃO DESEJADA:");
        System.out.println("----------------------------");
        System.out.println("EXEMPLO: / * + -");
        operacao = teclado.nextLine();
      
        }
        switch(operacao){
        
            case "+":
                System.out.println("A soma é " + (n1+n2));
                break;
            case "-":
                System.out.println("A subtração é " +(n1-n2));
                break;
            case "*":
                System.out.println("A multiplicação é " + (n1*n2));
                break;
            case "/":
                System.out.println("A divisão é " + (n1/n2));
                break;
                
            default:
                System.out.println("OPERAÇÃO INVÁLIDA");
            
        }
    }
    
}
