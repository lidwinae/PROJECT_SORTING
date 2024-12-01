package sort;

/* Lidwina Eleonora Dora - 235150707111019

//        //  //////    //      //  //  //\\    //    ////
//        //  //    //  //      //  //  // \\   //  //    //
//        //  //    //  //  //  //  //  //  \\  //  ////////
//        //  //    //  //  //  //  //  //   \\ //  //    //
////////  //  //////      //  //    //  //    \\//  //    //

*/

public class Bubble {
    // field untuk array nama-nama barang
    private String[] nama;

    // field untuk array harga-harga barang
    private double[] harga;

    // konstruktor tanpa parameter
    public Bubble() {}

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
                "-------------------------------------------------"
        );

        // Bubble Sort
        int n = harga.length;
        double temp;
        String name;

        for (int i = 0; i < n; i++) {
            for (int j=1; j < (n-i); j++) {
                // bandingkan elemen sebelah
                if (harga[j-1] < harga[j]) {
                    // tukar elemen jika tidak sesuai urutan
                    temp = harga[j-1];
                    harga[j-1] = harga[j];
                    harga[j] = temp;

                    // cocokkan nama dengan harganya
                    name = nama[j-1];
                    nama[j-1] = nama[j];
                    nama[j] = name;
                }
            }
        }

        System.out.printf("%-25s |%-20s\n", "Nama Barang", " Harga Barang");
        for (int i = 0; i < nama.length; i++) {
            String rupiah = String.format(" Rp%,.2f", harga[i]);
            System.out.printf("%-25s |%-20s\n", nama[i], rupiah);
        }
        System.out.println(
                "-------------------------------------------------\n"
        );
    }
}