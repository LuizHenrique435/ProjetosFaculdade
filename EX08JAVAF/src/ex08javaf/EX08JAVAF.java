/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08javaf;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class EX08JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Scanner teclado = new Scanner(System.in);
            
            int n1, op=0;
            boolean resp = true;
            inicio:
            System.out.println("Informe um numero");
            n1= teclado.nextInt();
            
            if(n1==0){
            
            }
            else{
           for (int x = 0; x <= 10; x++) {
            System.out.println(n1 + " x " + x + " = " + n1*x);
            
               }
           }
        } 
    }
    

