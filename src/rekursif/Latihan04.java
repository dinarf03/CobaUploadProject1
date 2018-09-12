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
public class Latihan04 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dinar Fitri Vania Muti / X RPL 6 / 20");

        Scanner masuk = new Scanner(System.in);
        int a, b, z, n;

        System.out.print("Masukkan nilai awal : ");
        a = masuk.nextInt();

        System.out.print("Masukkan jumlah data : ");
        n = masuk.nextInt();

        System.out.print("Masukkan beda nilai : ");
        b = masuk.nextInt();
        penghitung(a, n, b, 0);
        z = aritmatik(a, n, b);
        System.out.println(z);
    }

    public static void penghitung(int pght, int n, int b, int i) {
        System.out.print(pght);
        if (i < n - 1) {
            pght = +pght + b;
        }

    }

    public static int aritmatik(int x, int n, int b) {
        int sn = 0, sn2 = 0, a = x, un = 0, un2, un3, i = x;

        un3 = n - 1;
        un2 = un3 * b;
        un = a + un2;
        sn2 = a + un;
        sn = sn2 * n / 2;
        return sn;
    }
}
