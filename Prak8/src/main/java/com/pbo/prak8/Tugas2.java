/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak8;
import javax.swing.JOptionPane;
/**
 *
 * @Created By Diuel
 */
public class Tugas2 {
    public static void main(String[] args) {

        int number[] = new int[11];
        int jumlah,max;

            for(int i = 1 ; i < number.length ; i++)
            {
             number[i] = Integer.valueOf(JOptionPane.showInputDialog("Silahkan Masukan Angka Ke " +i+ " : "));
            }

        jumlah = 10;
        max = number[0];

        for(int i = 0; i <= jumlah ; i++)
        {
            if(number[i] > max)
            {
                max = number[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Angka Terbesar Yang Anda Inputkan : " + max);
    }
}
