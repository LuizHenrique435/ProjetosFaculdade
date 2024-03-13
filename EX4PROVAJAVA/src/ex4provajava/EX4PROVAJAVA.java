/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4provajava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX4PROVAJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        int n1 = teclado.nextInt();
        
        if (n1>0) {
            System.out.println("Número Positivo");
            
        }
        else{
            if (n1<0) {
                System.out.println("Numero negativo");
            }
            else{
                System.out.println("Numero neutro");
            }
        }
    }
    
}
