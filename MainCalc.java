package Comp;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class MainCalc {
    public static void main (String[]args) {
        Scanner inputInt = new Scanner(System.in);
        int menu;
        Calculator calc = new Calculator();



        do {
            System.out.println("1.Pertambahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("EXIT");



            System.out.println("Pilih menu: ");
            menu = inputInt.nextInt();

            if(menu <5) {

            System.out.println("Masukkan angka pertama: ");
            calc.bil1 = inputInt.nextInt();
            System.out.println("Masukkan angka kedua: ");
            calc.bil2 = inputInt.nextInt();

                switch (menu) {
                    //method perkalian
                    case 1:
                        int hasilPert = calc.pertambahan(calc.bil1, calc.bil2);
                        System.out.println("Hasil pertambahannya adalah " + hasilPert);
                        break;
                    //method berhenti
                    case 2:
                        int hasilPeng = calc.pengurangan(calc.bil1, calc.bil2);
                        System.out.println("Hasil pengurangannya adalah " + hasilPeng);
                        break;
                    //method mati
                    case 3:
                        int hasilPerk = calc.perkalian(calc.bil1, calc.bil2);
                        System.out.println("Hasil perkaliannya adalah " + hasilPerk);
                        break;
                    case 4:
                        int hasilPemb = calc.pembagian(calc.bil1, calc.bil2);
                        System.out.println("Hasil pembagiannya adalah " + hasilPemb);
                        break;
                }
            } else if (menu >= 5) {
                System.out.println("===EXIT PROGRAM===");
            }
        }
        while (menu<5);
    }
}
