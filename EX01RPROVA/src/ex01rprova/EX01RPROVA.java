/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01rprova;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX01RPROVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int nota[] = new int[4];
        int freq;
        double media = 0;
        
        System.out.println("Informe sua Frequencia");
        freq = teclado.nextInt();
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe uma nota");
            nota[i] = teclado.nextInt();
            media = nota[i]+media;
            
        }
        media = media/4;
        resultado(nota,freq,media); 
       
    }
    
    public static void resultado(int[] nota, int freq, double media){
        
        if (freq<75) {
            System.out.println("REROVADO POR FREQUENCIA");
        }
        else{
            if (media>=7) {
                System.out.println("ALUNO APROVADO");
            }
            else if (media>=5 && media<7) {
                    System.out.println("SERÁ SUBMETIDO A PROVA");
                    
                }
                else{
                    System.out.println("REPROVADO");
                }
            }
        }
        
}
    

