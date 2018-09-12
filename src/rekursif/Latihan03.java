/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;

import java.util.Scanner;

/**
 *
 * @author Dinar F V M
 */
public class Latihan03 {

    public static void cetakAngka(int angka) {
        if (angka >= 1) {

            System.out.println(angka + " ");
            cetakAngka(--angka);
        }
    }

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        System.out.println("Dinar Fitri Vania Muti / X RPL 6 / 20");

        System.out.print("Masukkan sembarang angka : ");
        int Angka = baca.nextInt();

        cetakAngka(Angka);
    }
}
