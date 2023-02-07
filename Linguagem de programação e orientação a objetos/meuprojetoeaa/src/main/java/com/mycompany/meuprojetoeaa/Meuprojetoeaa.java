/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.meuprojetoeaa;

/**
 *
 * @author ALN
 */


public class Meuprojetoeaa {
// criar variáveis com casas decimais; tirar a média e exibir o resultado
    public static void main(String[] args) 
    {
        int a, b, idade;
        a = 2;
        b = 4;
        int c = a + b;
        float d;
        boolean e;
        String f, nome;
        f = "Emily";
        double pri, seg, ter, res;
        pri = 6.5;
        seg = 3.333;
        ter = 4.77;
        res = (pri + seg + ter) / 3;
       
        nome = "Emily";
        idade = 21;
        if (idade > 18)
        {
            System.out.printf("%s, você pode entrar! %n", nome);
        } 
        else 
        {
                System.out.printf("%s, você não pode entrar!", nome);
        }
      
        System.out.println("Olá mundo!");
        System.out.println(c);
        System.out.printf("a soma é %.4f", res);
        
    }
}
