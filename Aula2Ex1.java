package com.mycompany.aula2ex1;

import java.util.Scanner; //importa o pacote de scan

public class Aula2Ex1 
{

    public static void main(String[] args) //define o método
    {
        Scanner leitor = new Scanner(System.in); //criando uma nova instancia de chamada
        int valor1, valor2;                      //declara as variáveis
        
        System.out.print("Digite os valores:\n"); //exiba ...
        valor1 = leitor.nextInt();             //le o valor e armazena na variavel
        valor2 = leitor.nextInt();             //le o valor e armazena na variavel
        
        if (valor1 > valor2)                       //se valor1 > valor 2 exibir valor1.
        {
            System.out.println("" +valor1);
        }
        else                                        //caso contrario exibir valor2.
        {
            System.out.println("" +valor2);
        }
    }
}
