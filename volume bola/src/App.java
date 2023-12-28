import java.util.Scanner;
class Menghitung_Volume_bola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menghitung Volume Bola
        System.out.print("Masukan Jari-jari bola: ");
        double Jarijari = scanner.nextDouble();
        double phi = 3.14;
        double Volume = 4/3*phi*Jarijari*Jarijari*Jarijari;
        System.out.println("Volume adalah: " + Volume + "m^3");
        
        scanner.close();
    }
}