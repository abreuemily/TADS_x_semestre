/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.porcentagem;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Porcentagem 
{

    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        int avaliacao1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da 1° avaliação:"));
        int avaliacao2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da 2° avaliação:"));
        double media; 
        media = (avaliacao1 + avaliacao2) / 2;
        JOptionPane.showMessageDialog(null,"A sua média é: " + media);
        
        
         
        
    }
}
