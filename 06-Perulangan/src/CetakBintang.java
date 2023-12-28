package com.tutorial;

import java.util.Scanner;
public class CetakBintang {
    public static void main(String[] args) {
        
             //Membuat Variabel untuk Menampung Jumlah Angka
        int i,j;
        
        //Membuat Objek Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Angka: ");
        int angka = input.nextInt();
        
        //Perulangan berdasarkan Angka
        for(i = 0; i < angka; i+=1){
        for(j = 0; j < i; j+=1) {
            System.out.print("*");
        }
            System.out.println("*");
    }
}
}
