class Module2Nomor1 {
    public static void main(String[] args) {
        String name="Rifky Muhammad Prayudhi", skorMatematika ="96";
        int skorBahasaInggris = 82;
        
        // \n digunakan untuk membuat garis baru
        System.out.println(
            "Nama : " +  name + "\n" +
            "Skor Matematika : " +  skorMatematika + "\n" +
            "Skor Bahasa Inggris : " +  skorBahasaInggris
        );

        // String.valueOf() itu sebuah fungsi untuk mengubah nilai dari suatu variable bertipe data integer menjadi string
        System.out.println(skorMatematika + String.valueOf(skorBahasaInggris));
        // Integer.parseInt() itu sebuah fungsi untuk mengubah nilai dari suatu variable bertipe data string menjadi integer
        System.out.print(Integer.parseInt(skorMatematika) + skorBahasaInggris);
    }
}