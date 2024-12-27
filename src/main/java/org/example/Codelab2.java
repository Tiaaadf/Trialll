package org.example;

import java.util.Scanner;
import java.util.Random;

public class Codelab2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] arrayInput = null;
        int panjang = 0;
        boolean menu = true;

        while (menu) {
            System.out.println("Menu: ");
            System.out.println("1. Menghasilkan Bilangan Bulat Acak");
            System.out.println("2. Memilih Elemen Acak dari Array");
            System.out.println("3. Keluar");
            System.out.println("Pilih menu (1-3): ");


            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nilai minimum: ");
                    int min = scanner.nextInt();
                    System.out.println("Masukkan nilai maksimum: ");
                    int max = scanner.nextInt();
                    int randomRange = random.nextInt(max - min + 1) + min;
                    System.out.println("Bilangan bulat acak antara (" + min + " sampai " + max + "): " + randomRange);
                    break;
                case 2:
                    System.out.println("Masukkan jumlah elemen dalam array: ");
                    panjang = scanner.nextInt();
                    scanner.nextLine();

                    arrayInput = new String[panjang];

                    System.out.println("Masukkan " + panjang + " elemen: ");
                    for (int i = 0; i < panjang; i++) {
                        System.out.println("Elemen ke-" + (i + 1) + ": ");
                        arrayInput[i] = scanner.nextLine();
                    }

                    int randomArray = random.nextInt(panjang);
                    System.out.println("Elemen acak dari Array: " + arrayInput[randomArray]);
                    break;
                case 3:
                    System.out.println("Keluar dari program");
                    menu = false;
                    break;

                default:
                    System.out.println("Pilihan kaga valid kocak");
            }
        }
        scanner.close();
    }
}