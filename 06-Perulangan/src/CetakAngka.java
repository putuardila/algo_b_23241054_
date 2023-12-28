package com.tutorial;
import java.util.Scanner;

public class CetakAngka {
    public static void main(String[] args) {
        
        //Membuat Variabel untuk Menampung Jumlah Angka
        int angka;
        
        //Membuat Objek Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Angka: ");
        angka = input.nextInt();
        
        //Perulangan berdasarkan Angka
        for(int i = 0; i < angka; i+=2) {
            System.out.print(i + " ");
        }
    }
}
