/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02vetor;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX02VETOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int x[]= new int[30];
        int soma = 0;
        
        for (int i = 0; i < 30; i++) {
            
            System.out.println("informe um numero");
            x[i] = teclado.nextInt();
             
            soma = soma+x[i];
             
        }
        
            System.out.println("a soma é " + soma);
    }
    
}
