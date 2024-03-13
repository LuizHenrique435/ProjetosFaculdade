/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5while;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX5WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        int n = teclado.nextInt();
        
        if(n<=0){
            System.out.println("Numero invalido");
        }
            else{
            int i =0;
            while(i<=10){
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
                    }
            
            }
        }
    }
    

