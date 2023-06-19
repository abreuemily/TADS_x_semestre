/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacofordouble;
import javax.swing.JOptionPane;
/**
 *
 * @author ALN
 */
public class Lacofordouble {

    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;
        for (int i = 0; i < 4; i++)
        {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da " + (i+1) +"º nota: "));
            soma = soma + notas[i];
            
        }
        for (int i = 0; 1 < 4; i++)
        {
            
        }
            
    }
}
