package com.tutorial;

import java.util.Scanner;

public class CetakAngkaGenap {
    public static void main(String[] args) {
        
        //Variabel untuk Menampung Jumlah Angka
        int angka;

        //Membuat Objek Scanner
        Scanner input =  new Scanner(System.in);

        System.out.print("Masukkan Jumlah Angka : ");
        angka = input.nextInt();

        // Perulangan berdasarkan Angka
        for(int i = 2; i < angka; i+=2) {

            System.out.print(i + " ");
        }
    }
}
