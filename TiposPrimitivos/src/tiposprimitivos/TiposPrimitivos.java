/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author pc gamer
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //System.out.format = System.out.printf
        Scanner teclado = new Scanner(System.in);
        System.out.print("O nome do desenvolvedor é:");
        String nome = teclado.nextLine();
        System.out.printf("O salario do %s é (ex:1000,00): ",nome);
        float sal = teclado.nextFloat();
        System.out.printf("A idade do %s é: ",nome);
        int idade = teclado.nextInt();
        System.out.printf("O %s está atualmente ativo? (true / false): ",nome);
        boolean ativo = teclado.nextBoolean();
        System.out.format("Situação do contribuinte %s : %b\nSalario: %.2f \nCom %d anos de idade \n",nome,ativo,sal,idade);
    }
    
}
