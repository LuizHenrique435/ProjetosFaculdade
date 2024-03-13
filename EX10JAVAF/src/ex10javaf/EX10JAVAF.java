/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10javaf;

/**
 *
 * @author henri
 */
public class EX10JAVAF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int par=0;
        for (int i = 30; i>0; i--) {
            if (i%2!=0) {
                System.out.println(i);
            }
            if (i%2==0) {
                par++;
           
            }
            
        }
             System.out.println("Nesse intervalo se obteve " + par + " numero pares ");
        
    }
    
}
