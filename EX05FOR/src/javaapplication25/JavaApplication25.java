/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int i;
        
        System.out.println("Insira um número");
        i=teclado.nextInt();
        if(i==0){
        return;
        }
        for (int x = 0; x <= 10; x++) {
            System.out.println(i + " x " + x + " = " + i*x);
        }
        
        
    }
    
}
