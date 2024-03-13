/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06javaf;

import java.util.Scanner;

/**
 *
 * @author henri
 */
public class EX06JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        String mes=null;
        int diasI=31,diasEs=28,diasP=30;
        
        
        System.out.println("Informe um mês");
        mes=teclado.nextLine().toLowerCase();
        
        switch(mes){
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
       
            System.out.println("O mês possui " + diasI + " dias ");

            break;
            
             case "abril":
            case "junho":
            case "setembro":
            case "novembro":
            
            System.out.println("O mês possui " + diasP + " dias ");

            break;
            
             case "fevereiro":
       
            System.out.println("O mês possui " + diasEs + " dias ");

            break;
        
            default:
            System.out.println("mês inexistente ");
            
        }
    }
    
}
