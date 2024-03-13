/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03vetor;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX03VETOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        String resp = null;
        String mes31[]={"janeiro", "março", "maio", "julho", "agosto", "outubro", "dezembro"};
        String mes30[]={"abril", "junho", "setembro", "novembro"};
        
        System.out.println("Insira um mes");
        resp = teclado.nextLine().toLowerCase();
        
        for (int i = 0; i < 4; i++) {
            if(mes30[i].equals(resp)){
                System.out.println("O mês tem 30 dias");
                return;
            }
            for (int j = 0; j < 7; j++) {
                if(mes31[j].equals(resp)){
                System.out.println("O mês tem 31 dias");
                return;
            }
                else if (resp.equals("fevereiro")) {
                    System.out.println("O mês tem 28 dias");
                    return;
                }
            }
        }
        
    }
    
}
