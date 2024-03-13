/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02javafuncao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX02JAVAFUNCAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int i=0;
        boolean x = true;
        
      
        while(x==true){
        System.out.println("Informe um número");
        i=teclado.nextInt();
        
        if (i<=0){
        System.out.println("Informe um número correto");
        System.out.println("deseja digitar um novo numero:");
        x=teclado.nextBoolean();
        }
        else{
        tabuada(i);
        }
        }
        
        
    }
    
    public static void tabuada(int i){
        
        for (int x = 0; x <= 10; x++) {
            System.out.println(i + " x " + x + " = " + i*x);
        }
        
    }
    
}
