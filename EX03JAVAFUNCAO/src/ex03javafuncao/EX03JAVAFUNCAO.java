/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03javafuncao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX03JAVAFUNCAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String operacao;
        int x, y;
        
        Scanner teclado =new Scanner(System.in);
        
        System.out.println("informe um numero");
        x=teclado.nextInt();
        
        System.out.println("informe um numero");
        y=teclado.nextInt();
        
        System.out.println("informe a operacao");
        operacao=teclado.nextLine();
        operacao=teclado.nextLine();
        
        operacao(operacao, x, y);
        
        
    }
    
    public static void operacao(String operacao, int x, int y){
    
        switch(operacao){
            case "+": 
                System.out.println("A soma é " + (x+y));
            break;
            case "-": 
                System.out.println("A sub é " + (x-y));
            break;
            case "/": 
                System.out.println("A soma é " + (x/y));
            break;
            case "*": 
                System.out.println("A soma é " + (x*y));
            break;
            
            default: 
            System.out.println("OPERAÇÃO INVALIDA");
            break;
        }
    }
    
}
