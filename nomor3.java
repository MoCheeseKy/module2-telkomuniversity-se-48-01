// import scanner untuk menggunakan fungsi scanner pada java
import java.util.Scanner;

class Module2Nomor3 {
    public static void main(String[] args) {
        // buat variable dengan tipe data Scanner, ini bisa disebut juga functional variable
        Scanner input = new Scanner(System.in);

        // membuat variable nilai pi (sesuai soalnya itu 3.14)
        double pi = 3.14;

        System.out.print("Masukan jari-jari : ");
        double jarijari = input.nextDouble(); // menerima input untuk jarijari
        // ada sedikit catatan disini, java agak beda soalnya
        // di beberapa kasus yang pernah aku temuin, misal kalian kalo masukin angka 5. Nah.... jangan lupa tambahin ,0 dibelakangnya, jadi 5,0 
        // soalnya dibeberapa kasus kalo ga nambahin ,0 tuh hasilnya ngaco
        // tapi misal masukannya cuman 7,5 itu aman aman aja, pokoknya nambahin angka diobelakang koma
        // nahh... tapi kalo misal nambahin angka dibelakang koma malah error, berarti gausah ditambahin, misal 5 jadi 5 aja

        // membuat variable result yang akan menyimpan hasil dari perhitungan luas lingkaran
        // rumusnya pi * jari-jari * jari-jari
        double result = pi*jarijari*jarijari;

        System.out.print(result);
    }
}