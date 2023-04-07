package Condition;
public class Test {
    public static void main(String[] args) {
        String[] arrayWarna = {"hitam", "biru", "putih", "merah", "kuning"};
        for (String warna:arrayWarna){
            if (warna=="putih") continue;
            System.out.println(warna);
        }
    }
}
//    Buat kelas Java sederhana untuk mencetak larik string ini {“hitam”, “biru”, “putih”, “merah”, “kuning”} menggunakan For Each loop
//Kriteria :
//        Buat array string bernama "warna" yang berisi {"hitam", "biru", "putih", "merah", "kuning"}
//        Cetak pernyataan ini dan warnanya -> “Warnanya adalah “ + warna
//        Diberikan deretan string {"hitam", "biru", "putih", "merah", "kuning"}, buat kelas Java sederhana untuk mencetak semua elemen dalam larik kecuali "putih".