/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03lncl;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX03LNCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int n;
        
        System.out.println("Qual tamanho da matriz");
        n = teclado.nextInt();
        
        int matriz[][] = new int[n][n];
        
        int valor=0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j]=valor;
                valor++;
                System.out.println("O valor da matriz é " + matriz[i][j]);
            }
            
        }
        
        
        
        
        
    }
    
}
