/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;

/**
 *
 * @author Dinar F V M
 */
public class Latihan02 {

    public static void cetak(int i) {
        if (i > 0) {
            System.out.println("SMK Telkom Malang");
            cetak(--i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Dinar Fitri Vania Muti / X RPL 6 / 20");

        //MENAMPILKAN TEKS SMK TELKOM MALANG SEBANYAK 5 KALI
        cetak(5);
    }

}
