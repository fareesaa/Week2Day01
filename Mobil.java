package Comp;

public class Mobil {
    public String merek ="";
    public String warna = "";
    //public String status= "";

    public void info(){
        System.out.println(merek + warna);
    }
    public void berjalan(){
        System.out.println(merek + " " + warna + " sedang berjalan.");
    }
    public void berhenti(){
        System.out.println(merek + " " + warna + " sedang berhenti.");
    }
    public void mati(){
        System.out.println(merek + " " + warna + " shut down.");
    }
}

