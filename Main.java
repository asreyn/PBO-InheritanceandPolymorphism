public class Main {
    public static void main(String[] args) {
        // Polymorphism: array bertipe Bentuk berisi objek anak-anaknya
        Bentuk[] daftar = new Bentuk[4];
        daftar[0] = new Bentuk("Merah");
        daftar[1] = new BujurSangkar(5, "Biru");
        daftar[2] = new Lingkaran(7, "Hijau");
        daftar[3] = new Silinder(10, 7, "Kuning");

        for (Bentuk b : daftar) {
            b.printInfo();   // versi printInfo() yang jalan sesuai objek aslinya
        }
    }
}