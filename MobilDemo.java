package Comp;
import java.util.Scanner;

public class MobilDemo {

    public static void main (String[]args) {

        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        //instance object
        Mobil mobil1 = new Mobil();

        //tambah object
        System.out.println("Masukkan merek mobil: ");
        mobil1.merek = inputStr.nextLine();
        System.out.println("Masukkan warna mobil: ");
        mobil1.warna = inputStr.nextLine();

        int menu;
        do {
            System.out.println("1.Gas");
            System.out.println("2.Rem");
            System.out.println("3.Mati");
            System.out.println("Pilih menu: ");
            menu = inputInt.nextInt();
            switch (menu){
                //method berjalan
                case 1:
                    mobil1.berjalan();
                    break;
                //method berhenti
                case 2:
                    mobil1.berhenti();
                    break;
                //method mati
                case 3:
                    mobil1.mati();
                    break;
                case 4:
                    mobil1.info();
                    break;
            }
        }
        while (menu<3);
    }
}
