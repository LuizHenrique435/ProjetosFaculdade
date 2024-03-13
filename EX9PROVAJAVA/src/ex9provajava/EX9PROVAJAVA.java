/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9provajava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX9PROVAJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a operação + - * /");
        String operacao = teclado.nextLine();
        
        System.out.println("informe um numero");
        int n1 = teclado.nextInt();
        
        System.out.println("informe um numero");
        int n2 = teclado.nextInt();
        
        switch (operacao) {
            case "+":
                System.out.println("A Soma dos número é " + (n1+n2));
                break;
            case "-":
                System.out.println("A Subtração dos número é " + (n1-n2));
                break; 
            case "*":
                System.out.println("A Multi dos número é " + (n1*n2));
                break;    
            case "/":
                System.out.println("A Divisão dos número é " + (n1/n2));
                break;    
            default:
                System.out.println("OPERAÇÃO NÃO ENCONTRADA");
        }
        
    }
    
}
