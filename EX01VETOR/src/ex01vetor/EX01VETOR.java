/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01vetor;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX01VETOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        String produto[] = new String[10];
        
        for(int i = 0; i <10;i++){
            
            System.out.println("Informe um produto");
            produto[i] = teclado.nextLine();
    }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(produto[i]);
        }
        
        System.out.println("COM WHILE");
        
        int i = 0;
        while(i<10){
            System.out.println(produto[i]);
            i++;
        }
        
        System.out.println("COM FOR EACH");
        
        int j=0;
        for(String x : produto){
        System.out.println(produto[j]);
        j++;
    }
    }
    
}
