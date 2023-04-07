package Pengenalan.ODP;
class Motor{
    private void prosesBahanBakar(){
        System.out.println("Alirkan bahan bakar");
        System.out.println("Jalankan proses Pembakaran");
    }
    private void jalankanDiscBrake(){
        System.out.println("Jalankan disk brake");
    }
    public void gas (){
        prosesBahanBakar();
        System.out.println("Brumm Brumm");
    }
    public void rem() {
        jalankanDiscBrake();
        System.out.println("Ckitt... Ckitt..");
    }
}
public class abstraction {
    public static void main(String[] args){
    Motor toyota = new Motor();
    toyota.gas();
    toyota.rem();
}}
