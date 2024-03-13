/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06for;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX06FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in); 
        
         int par=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número");
            int n1=teclado.nextInt();
            
            if (n1%2==0) {
               
                par=par+1; 
            }
        }
        System.out.println("A quantidade de numeros pares são " + par);
    }
    
}
