// import scanner untuk menggunakan fungsi scanner pada java
import java.util.Scanner;

class Module2Nomor4 {
    public static void main(String[] args) {
        // buat variable dengan tipe data Scanner, ini bisa disebut juga functional variable
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan F(Farenheit) : ");
        int farenheit = input.nextInt(); // menerima input untuk jarijari

        // membuat variable celcius yang akan menyimpan hasil dari konversi nilai farenheit ke nilai celcius
        // rumusnya 5/9 * (F(farenheit) -32)
        double celcius = 5.0/9.0 * (farenheit -32);

        System.out.print(celcius);
    }
}