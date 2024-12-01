package sort;

/* Lidwina Eleonora Dora - 235150707111019

//        //  //////    //      //  //  //\\    //    ////
//        //  //    //  //      //  //  // \\   //  //    //
//        //  //    //  //  //  //  //  //  \\  //  ////////
//        //  //    //  //  //  //  //  //   \\ //  //    //
////////  //  //////      //  //    //  //    \\//  //    //

*/

public class Insertion {
    // field untuk array nama-nama barang
    private String[] nama;

    // field untuk array harga-harga barang
    private double[] harga;

    // konstruktor tanpa parameter
    public Insertion() {}

    // setter untuk nama
    public void setNama(String[] nama) {
        this.nama = nama;
    }

    // setter untuk harga
    public void setHarga(double[] harga) {
        this.harga = harga;
    }

    // method untuk output nama barang dan harga dalam tabel
    public void printTabel() {
        System.out.println(
                "---------------------------------------------------"
        );

        // Insertion Sort
        int n = harga.length;

        for (int i = 1; i < n; i++) {
            double key = harga[i];
            String keyNama = nama[i];
            int j = i - 1;

            // pindah elemen lebih besar ke posisi kanan
            while (j >= 0 && harga[j] > key) {
                harga[j + 1] = harga[j];
                nama[j + 1] = nama[j];
                j = j - 1;
            }
            harga[j + 1] = key;
            nama[j + 1] = keyNama;
        }

        System.out.printf("%-25s |%-20s\n", "Nama Barang", " Harga Barang");
        for (int i = 0; i < nama.length; i++) {
            String rupiah = String.format(" Rp%,.2f", harga[i]);
            System.out.printf("%-25s |%-20s\n", nama[i], rupiah);
        }
        System.out.println(
                "---------------------------------------------------\n"
        );
    }
}