/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arranjo;

import javax.swing.JOptionPane;

/**
 *
 * @author ALN
 */
public class Arranjo {

    public static void main(String[] args) {
        int[] arj = new int[4];
        for (int i = 0; i< 4; i++)
        {
            arj[i] = i + 1;
        }
        for (int i = 0; i < 4; i++)
        {
            JOptionPane.showMessageDialog(null, arj[i]);
        }
    }
}
