/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05javafuncao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX05JAVAFUNCAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        String escolha;
        double valorgasolina, valoralcool = 0, distanciapercorrida;
        
        System.out.println("O carro irá utilizar alcool ou gasolina?");
        escolha = teclado.nextLine().toLowerCase();
        System.out.println("Qual a distancia percorrida?");
        distanciapercorrida=teclado.nextDouble();
        
        
        
       
        
        
      
    }
    public static void valorgasto(String escolha, int valorgasolina, int valoralcool, int distanciapercorrida){
        
        double valorgasto;
        
    switch(escolha){
        case "gasolina":
            valorgasto = (valorgasolina*13)*distanciapercorrida;
            System.out.println("O valor gasto com gasolina é " + valorgasto);
            break;
            case "alcool": 
            valorgasto = (valoralcool*9)*distanciapercorrida;
                System.out.println("O valor gasto com alcool é " + valorgasto);
                break;
                
            default:
          
                
    }
        
    }
    
}
