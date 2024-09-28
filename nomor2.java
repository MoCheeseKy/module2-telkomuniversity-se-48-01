// import scanner untuk menggunakan fungsi scanner pada java
import java.util.Scanner;

class Module2Nomor2 {
    public static void main(String[] args) {
        // buat variable dengan tipe data Scanner, ini bisa disebut juga functional variable
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai a : ");
        int a = input.nextInt(); // menerima input untuk nilai a
        System.out.print("Masukan nilai b : ");
        int b = input.nextInt(); // menerima input untuk nilai b

        // membuat variable baru yang akan memiliki nilai yang sama dengan nilai a
        // misal user menginput angka 10 ke nilai a, maka disini c akan memiliki nilai yang sama dengan a, jadi c akan bernilai 10 juga
        // btw, c disini tujuan utamanya sebagai tempat nyimpen data di a, untuk nanti di tukarkan dengan nilai b
        int c=a;
        // menggantikan nilai a dengan nilai b
        // misal user input nilai 20 ke nilai b, maka disini a akan memiliki nilai yang sama dengan b, jadi a akan bernilai 20
        a=b;
        // menggantikan nilai b dengan nilai c
        // tadi kita sudah menyimpan nilai a ke nilai c. disini nilai b digantikan dengan nilai c
        b=c;
        // pada proses diatas, nilai a dan b akan tertukar, sesuai dengan harapan pada nomor 2 (yaitu menukar nilai a dengan nilai b)
        // ni kalo ga jelas, tanya langsung ae layah ke gua :v

        System.out.print(a);
        System.out.print(b);
    }
}