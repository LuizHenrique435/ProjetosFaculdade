/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3provajava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX3PROVAJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        int n1 = teclado.nextInt();
        System.out.println("Informe um numero");
        int n2 = teclado.nextInt();
        
        int soma =(n1+n2);
        
        if (soma%2==0) {
            System.out.println("A soma é PAR");
        }
        else{
            System.out.println("A soma é Impar");
        }
        
    }
    
}
