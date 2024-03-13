/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String nome;
        float salario;
        char letra;
        int idade;
        boolean casado;
        
        //System.out.println("OLÁ MUNDO");
        //LEIA
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("INFORME SEU NOME FDP");
        nome = teclado.nextLine();
        
        System.out.println("O nome informado foi: " + nome);
        
        System.out.println("Informe seu salario!");
        salario = teclado.nextFloat();
        System.out.println("Seu salario é: " + salario);
        
        System.out.println("Informe a primeira letra do seu time do coração");
        letra = teclado.next().charAt(0);
        System.out.println("A letra informada foi: " + letra);
        
        System.out.println("Informe sua idade");
        idade = teclado.nextInt();
        System.out.println("Sua idade é: " + idade);
        
        System.out.println("Você é casado?");
        casado = teclado.nextBoolean();
        
        if(casado == true){
        System.out.println("O senhor(a) é casado");
        }
        else{
        System.out.println("O senhor(a) é solteiro");
        }
        
        
        
        
    }
    
}
