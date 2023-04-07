package Pengenalan.ODP;
public class ODP {
    public static void main(String[] args) {
        Objek Toyota = new Objek("Toyota","Biru","Avanza",1500);
        System.out.println(Toyota.merk);
        Toyota.gas();
        Toyota.rem();
        Toyota.wiper();
    }
}
