/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07for;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX07FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i <=5; i++) {
            
            int n1=0;
            System.out.println("Insira o valor do produto");
            n1=teclado.nextInt();
            int valorpagar=0;
                    
            valorpagar= valorpagar+n1;
            
        }
        System.out.println("O valor a pagar é " + valorpagar );
    }
    
}
