/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5provajava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX5PROVAJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota");
        int n1 = teclado.nextInt();
        
        System.out.println("Informe a primeira nota");
        int n2 = teclado.nextInt();
        
        System.out.println("Informe a primeira nota");
        int n3 = teclado.nextInt();
        
        System.out.println("Informe a primeira nota");
        int n4 = teclado.nextInt();
        
        float media = (n1+n2+n3+n4)/4;
        
        System.out.println("Informe a sua frequencia");
        int freq = teclado.nextInt();
        
        if(freq<75){
            System.out.println("ALUNO REPROVADO");
        }
        else{
        if(media>=6)System.out.println("APROVADO");
        if(media==5)System.out.println("RECUPERAÇÃO");
        if(media<4)System.out.println("REPROVADO");
        }
        
        
        
        
    }
    
}
