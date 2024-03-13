/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04javafuncao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX04JAVAFUNCAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int dolar;
        
        System.out.println("Informe o valor em dolar para a conversão");
        dolar= teclado.nextInt();
        
        double real = conversao(dolar);
        
        System.out.println(dolar + " dolares em real é " + real + " reais");
        
        
    }
   public static double conversao(int dolar){
    
    double taxadcambio = 5.50;
        
    double real = dolar*taxadcambio;
    
    return real;
    
    
        }
    }

    

