/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1provajava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX1PROVAJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe seu nome");
        String nome = teclado.nextLine();
        
        System.out.println("Informe sua Matricula");
        String matricula = teclado.nextLine();
        
        System.out.println("Informe sua turma");
        String turma = teclado.nextLine();
        
        System.out.println("Seu nome é: " + nome + " sua matricula é: " +matricula +" sua turma é: " +turma);
        
    }
    
}
