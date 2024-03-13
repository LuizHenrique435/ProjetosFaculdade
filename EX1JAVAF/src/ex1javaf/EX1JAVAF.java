/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1javaf;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class EX1JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.println("Informe um numero");
        n1 = teclado.nextInt();
        System.out.println("Informe um numero");
        n2 = teclado.nextInt();
        System.out.println("Informe um numero");
        n3 = teclado.nextInt();
        
        if (n1==n2 || n1 == n3) {
            System.out.println("VALORES IGUAIS");
        }
        else{
        
        if (n1>n2) {
            if (n1>n3) {
                System.out.println("O maior número é o " + n1);
            }
        }
        else
            {
                if (n2>n1) {
                    if (n2>n3) {
                        System.out.println("O maior número é o " + n2);
                    }
                    else{
                        System.out.println("O maior numero é o " + n3);
                    }
                }
            }
      }  
    }
    
}
