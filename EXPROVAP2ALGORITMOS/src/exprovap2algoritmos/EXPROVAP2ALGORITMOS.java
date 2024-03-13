/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exprovap2algoritmos;

import java.util.Scanner;

/**
 *
 * 
 * 
 * @author 
 * LUIZ HENRIQUE SOUZA SILVA
 * MARLON VICTOR COSTA SANTOS
 * KAUAN PADILHA DE SOUZA
 * ARTHUR GIRIBOLA
 * 
 * EXERCICIO
 * 
 * SISTEMA DE COMPRAS DE UM SUPERMERCADO COM OS SETORES DE PRODUTOS SECOS E BEBIDAS
 */
public class EXPROVAP2ALGORITMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        String dc="n";
        String fc="s";
        int i=0,j=0;
        double total=0;
        String vetorseco[]=new String[10];
        String vetormolhado[]=new String[10];
        
        System.out.println("------------------------------");
        System.out.println("---SUPERMERCADO SUPERLOKO-----");
        System.out.println("------------------------------");
        
        while(dc.equals("n")) {
             while(fc.equals("s")){
            System.out.println("Olá, qual setor deseja realizar as compras?\n 1.ALIMENTOS SECOS \n 2.BEBIDAS");
            int resp = teclado.nextInt();
            
            switch(resp){
            case 1:
                System.out.println("Os produtos secos são: \n 1.Arroz - R$10,00 \n 2.Feijão - R$8,00");
                int prod1 = teclado.nextInt();
                if(prod1 == 1){
                    vetorseco[i]="Arroz";
                    total=total+10;
                    i=i+1;
                    System.out.println("Deseja continuar comprando?[S/N]");
                    teclado.nextLine();
                    fc = teclado.nextLine().toLowerCase();
                    
                }
                else if(prod1==2){
                vetorseco[i]="Feijão";
                total=total+8;
                i=i+1;
                System.out.println("Deseja continuar comprando?[S/N]");
                teclado.nextLine();    
                fc = teclado.nextLine().toLowerCase();
                    
                }
                else{
                    System.out.println("VALOR INSERIDO INVÁLIDO");
                }
            break;
            case 2:
                System.out.println("As bebidas disponiveis são:\n 1.Coca-Cola - R$10,00\n 2.Pepsi - R$7,00");
                int prod2 = teclado.nextInt();
                if(prod2 == 1){
                    vetormolhado[j]="Coca-Cola";
                    total=total+10;
                    j = j+1;
                    System.out.println("Deseja continuar comprando?[S/N]");
                    teclado.nextLine();
                    fc = teclado.nextLine().toLowerCase();
                    
                }
                else if(prod2==2){
                vetormolhado[j]="Pepsi";
                total=total+7;
                j = j+1;
                System.out.println("Deseja continuar comprando?[S/N]");
                teclado.nextLine();    
                fc = teclado.nextLine().toLowerCase();
                    
                }
                else{
                    System.out.println("VALOR INSERIDO INVÁLIDO");
                }
            break;
            default:
                    System.out.println("VALOR INSERIDO INVÁLIDO");
                break;
        }
            }
            System.out.println("O total a pagar é: " + total);
            System.out.println("Deseja finalizar compra?[S/N]");
            dc = teclado.nextLine().toLowerCase();
            if (dc.equals("s")) {
                System.out.println("Produtos comprados: \n");
                for(int k=0;k<10;k++){
                    if(vetorseco[k] != null){
                    System.out.println(vetorseco[k]);
                    }
                }
                for(int l=0;l<10;l++){
                    if(vetormolhado[l] != null){
                    System.out.println(vetormolhado[l]);
                    }
                }
                dc="s";
                metodopagamento(total);
                i=0;
                j=0;
            }else{
                fc="s";
            }
            
            
        }
 
    }
    
    public static void metodopagamento(double total){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual será o método de pagamento?\n 1.Dinheiro \n 2. Cartão Débito \n 3.Cartão Crédito");
        int metodo = teclado.nextInt();
        
        switch(metodo){
            case 1: 
                System.out.println("O valor de pagamento é: " + total);
                break;
            case 2: 
                System.out.println("O valor de pagamento é : " +total);
                break;
            case 3:
                System.out.println("O valor de pagamento é: " + (total=total+5));
                break;
        }
    }
    
}
