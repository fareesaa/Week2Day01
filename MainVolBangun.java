package Comp;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class MainVolBangun {
    public static void main (String[]args) {
        Scanner inputDou = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int menu;
        VolBangun volb = new VolBangun();

        do {
            System.out.println("1.Volume Balok");
            System.out.println("2.Volume Bola");
            System.out.println("3.Hitung Umur");
            System.out.println("EXIT");

            System.out.println("Pilih menu: ");
            menu = inputInt.nextInt();

            if(menu <4) {

                switch (menu) {
                    //method Balok
                    case 1:
                        System.out.println("Masukkan angka pertama: ");
                        volb.bil1 = inputDou.nextDouble();
                        System.out.println("Masukkan angka kedua: ");
                        volb.bil2 = inputDou.nextDouble();
                        System.out.println("Masukkan angka ketiga: ");
                        volb.bil3 = inputDou.nextDouble();
                        double hasilPert = volb.volBangun(volb.bil1, volb.bil2, volb.bil3);
                        System.out.println("Volume balok tersebut adalah " + hasilPert+ "cm3");
                        break;
                    //method Bola
                    case 2:
                        System.out.println("Masukkan jari-jari: ");
                        volb.bil1 = inputDou.nextDouble();
                        double hasilBola = volb.volBangun(volb.bil1);
                        System.out.println("Hasil pengurangannya adalah " + hasilBola);
                        break;
                    //method hitung Umur
                    case 3:
                        System.out.println("Masukkan tahun saat ini: ");
                        volb.bil1 = inputDou.nextDouble();
                        System.out.println("Masukkan tahun lahir: ");
                        volb.bil2 = inputDou.nextDouble();
                        int hasilUmur = volb.volBangun(volb.bil1, volb.bil2);
                        //int value = (int) hasilPerk;
                        System.out.println("Umur saat ini yaitu " + hasilUmur + " Tahun");
                        break;
                }
            } else if (menu >= 4) {
                System.out.println("===EXIT PROGRAM===");
            }
        }
        while (menu<4);
    }
}
