/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2provajava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX2PROVAJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um número");
        int n = teclado.nextInt();


        n = n/2;
        
        if (n<7) {
            System.out.println("Metade do numero menor que 7");
        }
        else{
            if (n>7) {
                System.out.println("Metade do numero maior que 7");
            }
            else{
                System.out.println("Metade do numero igual a 7");
            }
        }
    }
    
}
