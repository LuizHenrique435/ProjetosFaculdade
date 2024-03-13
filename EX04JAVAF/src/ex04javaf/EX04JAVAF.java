/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04javaf;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class EX04JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1, n2, soma;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        n1=teclado.nextInt();
        System.out.println("Informe um numero");
        n2=teclado.nextInt();
        
        soma=n1+n2;
        
        if (soma>20) {
            System.out.println("Soma dos dois numeros maior que 20");
        }
        else{
            if(soma==20){
                System.out.println("Soma dos dois numeros igual a 20");
            }
            else{
                System.out.println("Somados dois numeros menor que 20");
            }
        }
    }
    
}
