import java.util.Scanner;
class Menghitung_Percepatan_dan_kecepatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menghitung Kecepatan
        System.out.print("Masukkan jarak tempuh (dalam satuan meter): ");
        double jarakTempuh = scanner.nextDouble();
        System.out.print("Masukkan waktu tempuh (dalam satuan detik): ");
        double waktuTempuh = scanner.nextDouble();
        double kecepatan = jarakTempuh / waktuTempuh;
        System.out.println("Kecepatan adalah: " + kecepatan + " meter/detik.");

        // Menghitung Percepatan
        System.out.print("Masukkan Kecepatan awal (dalam satuan meter/detik): ");
        double kecepatanAwal = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam satuan detik): ");
        double waktu = scanner.nextDouble();
         System.out.print("Masukkan Kecepatan Setelah selang waktu (dalam satuan meter/detik^2): ");
        double kecepatanSetelahwaktu = scanner.nextDouble();
        double percepatan = (kecepatanSetelahwaktu-kecepatanAwal)/waktu;
        System.out.println("Percepatan adalah: " + percepatan + " meter/detik^2.");

        scanner.close();
    }
}
