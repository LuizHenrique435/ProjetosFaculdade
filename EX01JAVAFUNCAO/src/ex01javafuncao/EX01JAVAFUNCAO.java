/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01javafuncao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX01JAVAFUNCAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int a=0, b=0;
        
        System.out.println("Informe um numero");
        a=teclado.nextInt();
        
        System.out.println("Informe um numero");
        b=teclado.nextInt();
        
        informacao(a,b);
           
    }
    public static void informacao(int a, int b){
            
            if(a%b==0){
                System.out.println("Numero " + a + " divisivel por " + b);
            }
            else{
            System.out.println("Numero " + a + " não é divisivel por " + b);
            }
    }
}

