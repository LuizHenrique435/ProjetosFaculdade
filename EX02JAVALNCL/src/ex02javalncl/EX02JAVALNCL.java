/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02javalncl;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class EX02JAVALNCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        int[][] matriz = new int [4][4];
        
        int n1=0;
        int mediaaluno[] = new int[4];
        int mediaguarda = 0;
        int mediag = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.println("digite a nota...");
                n1=teclado.nextInt();
                
                matriz[i][j]=n1;
                
               mediaguarda=mediaguarda+n1;
                mediag=mediag+n1;
         
            }
            mediaaluno[i]=mediaguarda/4;
            System.out.println("a media do aluno é " + mediaguarda/4);
            mediaguarda=0;
            
        }
        
        System.out.println("a media geral dos alunos é " + mediag/16);
    }
    
}
