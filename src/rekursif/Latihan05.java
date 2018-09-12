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
public class Latihan05 {

    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dinar Fitri Vania Muti / X RPL 6 / 20");

        Scanner masuk = new Scanner(System.in);

        System.out.println("===Menghitung Faktorial dengan Rekursif===");

        System.out.print("Masukkan bilangan : ");
        int jawab = masuk.nextInt();
        int hasil = faktorial(jawab);

        System.out.println("Hasil : " + hasil);
    }

}
