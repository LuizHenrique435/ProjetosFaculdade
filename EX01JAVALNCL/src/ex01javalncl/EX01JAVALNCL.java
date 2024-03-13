/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01javalncl;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX01JAVALNCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int [][]matriz = new int[3][3];
        
        int n1=0;
        int soma = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Marcha, digita o numero...");
                n1=teclado.nextInt();
                soma = soma +n1;
                
                matriz[i][j]=n1;
             } 
        }
        System.out.println("A soma das matrizes é: " + soma);
        
    }
    
    
}
