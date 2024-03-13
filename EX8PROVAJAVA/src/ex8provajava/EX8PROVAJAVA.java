/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8provajava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX8PROVAJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe sua idade");
        int idade = teclado.nextInt();
        
        if(idade<=7)System.out.println("INFANTIL");
        else{
        if(idade>=8 && idade<=10)System.out.println("JUVENA");
        else{
        if(idade>=11 && idade<=17)System.out.println("ADOLESCENTE");
        else{
        if(idade>17 && idade<60)System.out.println("ADULTO");
        else{
        if(idade>60)System.out.println("IDOSO");

        }
        }
        }
        }
        
        
        
        
    }
    
}
