package Comp;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String jurusan;
    int fis;
    int kim;
    int bio;

    private Mahasiswa(){
        this.nama = "Default";
        this.jurusan = "Default";
        this.fis = 0;
        this.kim = 0;
        this.bio = 0;
    }

    private Mahasiswa(String nama, String jurusan){
        this.nama = nama;
        this.jurusan = jurusan;
    }
    private Mahasiswa(String nama, String jurusan, int fis, int kim, int bio){
        this.nama = nama;
        this.jurusan = jurusan;
        this.fis = fis;
        this.kim = kim;
        this.bio = bio;
    }
    public void getInput(){
        System.out.println("Nama: "+this.nama+"\t\t" + "Jurusan: " +this.jurusan);
        System.out.println("Nilai: ");
        System.out.println("Fisika\t" +  "Kimia\t" + "Biologi");
        System.out.println(this.fis + "\t\t" + this.kim + "\t\t" + this.bio);
    }

    public static void main (String[]args) {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int menu;
        Mahasiswa mhs = new Mahasiswa();

        do {
            System.out.println("1.Default Params");
            System.out.println("2.Cons 2 Params");
            System.out.println("3.Cons 5 Params");
            System.out.println("EXIT");

            System.out.println("Pilih menu: ");
            menu = inputInt.nextInt();

            if(menu <4) {

                switch (menu) {
                    //default
                    case 1:
                        System.out.println("Constructure tanpa params :");
                        System.out.println("Default Value :");
                        Mahasiswa mhs1 = new Mahasiswa();
                        mhs1.getInput();
                        break;
                    //2 parameter
                    case 2:
                        System.out.println("Masukkan Nama Mahasiswa :");
                        mhs.nama = inputStr.nextLine();
                        System.out.println("Masukkan Jurusan Mahasiswa :");
                        mhs.jurusan = inputStr.nextLine();
                        System.out.println("Constructure 2 params :");
                        Mahasiswa mhs2 = new Mahasiswa(mhs.nama, mhs.jurusan);
                        mhs2.getInput();
                        break;
                    //method hitung Umur
                    case 3:
                        System.out.println("Masukkan Nama Mahasiswa :");
                        mhs.nama = inputStr.nextLine();
                        System.out.println("Masukkan Jurusan Mahasiswa :");
                        mhs.jurusan = inputStr.nextLine();
                        System.out.println("Masukkan Nilai Fisika :");
                        mhs.fis = inputInt.nextInt();
                        System.out.println("Masukkan Nilai Kimia :");
                        mhs.kim = inputInt.nextInt();
                        System.out.println("Masukkan Nilai Biologi :");
                        mhs.bio = inputInt.nextInt();
                        System.out.println("Constructure 5 params :");
                        Mahasiswa mhs3 = new Mahasiswa(mhs.nama, mhs.jurusan, mhs.fis, mhs.kim, mhs.bio);
                        mhs3.getInput();
                        break;
                }
            } else if (menu >= 4) {
                System.out.println("===EXIT PROGRAM===");
            }
        }
        while (menu<4);
    }
}
