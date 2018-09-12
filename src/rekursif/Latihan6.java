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
public class Latihan6 {

    static String[] mahasiswa = {"Amin", "Bela", "Cinta", "Deni"};

    public static void main(String[] args) {
        // TODO code application logic here
        getMahasiswa(0);
    }

    static void getMahasiswa(int absensi) {
        if (absensi < mahasiswa.length) {
            System.out.println("Absensi No--" + (absensi + 1) + " Bernama : "
                    + mahasiswa[absensi]);
            getMahasiswa(++absensi);

        }
    }
}
