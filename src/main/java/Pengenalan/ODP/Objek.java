package Pengenalan.ODP;
public class Objek {
    String merk,warna,tipe;
    int kapasitaBensin;
    public Objek(String merk,String warna, String tipe, int kapasitasBensin){
        this.merk = merk;
        this.warna = warna;
        this.tipe = tipe;
        this.kapasitaBensin = kapasitasBensin;
    }

    public void gas (){
        System.out.println("Bremmm");
    }
    public void rem (){
        System.out.println("Ckit.....");
    }
    public void wiper (){
        System.out.println("wuush wuush wuush");
    }
}
