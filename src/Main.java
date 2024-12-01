import java.util.*;

/* Lidwina Eleonora Dora - 235150707111019

    //        //  //////    //      //  //  //\\    //    ////
    //        //  //    //  //      //  //  // \\   //  //    //
    //        //  //    //  //  //  //  //  //  \\  //  ////////
    //        //  //    //  //  //  //  //  //   \\ //  //    //
    ////////  //  //////      //  //    //  //    \\//  //    //

    Aplikasi pengurut harga barang dengan menggunakan 2 metode sorting:
    1. Insertion Sort untuk Ascending (kecil ke besar)
    2. Bubble Sort untuk Descending (besar ke kecil)
*/

import sort.Insertion;
import sort.Bubble;

public class Main {
    public static void main(String[] args) {
        // pemanggilan scanner
        Scanner lidwina = new Scanner(System.in);

        // pewarna teks atau tulisan
        String WHITE = "\u001B[0m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        // output judul
        System.out.println(YELLOW + """
                Aplikasi Pengurut Harga Barang
                dengan Insertion Sort dan Bubble Sort
                Lidwina Eleonora Dora - 235150707111019
                """ + WHITE);

        // scan jumlah barang
        System.out.println("Masukkan jumlah barang:");
        int jumlah = lidwina.nextInt();
        lidwina.nextLine();
        System.out.println();

        // deklarasi array untuk nama barang dan harganya
        String[] nama = new String[jumlah];
        double[] harga = new double[jumlah];

        // scan nama barang dan harganya
        for(int i = 0; i < jumlah; i++) {
            System.out.println("Barang ke-" + (i+1));
            System.out.print("Nama Barang\t\t: ");
            nama[i] = lidwina.nextLine();
            System.out.print("Harga Barang\t: ");
            harga[i] = lidwina.nextDouble();
            lidwina.nextLine();
            System.out.println();
        }

        // pemanggilan objek ascending dari class Insertion
        Insertion ascending = new Insertion();

        // pemanggilan objek descending dari class Bubble
        Bubble descending = new Bubble();

        // output pengurutan harga
        System.out.println(YELLOW + """
                ===============================
                Pengurutan Harga Barang
                oleh\t: Lidwina Eleonora Dora
                NIM\t\t: 235150707111019
                ===============================
                """ + WHITE);

        // ascending dengan insertion sort
        System.out.println(GREEN +
                "Ascending dari kecil ke besar dengan Insertion Sort" +
                WHITE);
        ascending.setHarga(harga);
        ascending.setNama(nama);
        ascending.printTabel();

        // descending dengan bubble sort
        System.out.println(GREEN +
                "Descending dari besar ke kecil dengan Bubble Sort" +
                WHITE);
        descending.setHarga(harga);
        descending.setNama(nama);
        descending.printTabel();
    }
}