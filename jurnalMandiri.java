// import scanner untuk menggunakan fungsi scanner pada java
import java.util.Scanner;

class JurnalMandiri {
    public static void main(String[] args) {
        // buat variable dengan tipe data Scanner, ini bisa disebut juga functional variable
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nomor pertama : ");
        int NomorPertama = input.nextInt(); // menerima input untuk nomor pertama
        System.out.print("Masukan nomor kedua : ");
        int NomorKedua = input.nextInt(); // menerima input untuk nomor kedua

        // operator + digunakan untuk melakukan penjumlahan
        System.out.println("Hasil penjumlahan : " + (NomorPertama + NomorKedua));
        // operator - digunakan untuk melakukan pengurangan
        System.out.println("Hasil pengurangan : " + (NomorPertama - NomorKedua));
        // operator * digunakan untuk melakukan perjkalian
        System.out.println("Hasil perkalian : " + (NomorPertama * NomorKedua));
        // operator / digunakan untuk melakukan pembagian
        System.out.println("Hasil pembagian : " + (NomorPertama / NomorKedua));
        // operator % digunakan untuk mencari hasil sisa bagi (modulus)
        System.out.print("Sisa : " + (NomorPertama % NomorKedua));
    }
}