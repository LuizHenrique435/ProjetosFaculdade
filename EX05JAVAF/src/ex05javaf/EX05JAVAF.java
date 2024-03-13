/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05javaf;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class EX05JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor de A");
        a=teclado.nextInt();
        System.out.println("Informe o valor de B");
        b=teclado.nextInt();
        
        if(a>b){
            System.out.println("A maior que B");
        }
        else{
            if (a==b) {
                System.out.println("A igual B");
            }
            else{
                System.out.println("B maior que A");
            }
        }
    }
    
}
