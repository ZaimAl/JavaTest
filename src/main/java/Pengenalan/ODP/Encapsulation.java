package Pengenalan.ODP;
class siswa {
    private String nama;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        siswa siswa1 = new siswa();
        siswa1.setNama("Jay");
        System.out.println(siswa1.getNama());
    }
}
