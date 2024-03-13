/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03javaf;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class EX03JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Informe um numero");
        int n1 = teclado.nextInt();
        
        if(n1%2!=0){
            System.out.println("Numero divisivel por 3");
        }
        else{
            System.out.println("Numero não divisivel por 3");
        }
    }
    
}
