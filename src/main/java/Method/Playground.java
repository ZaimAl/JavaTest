package Method;
public class Playground {
    //No static
//    void Hello (){
//        System.out.println("Hello");
//    }
    //Static
    static void greeting(){
        System.out.println("cuy");
    }
    // Parameter / Inputan
    static void coba(String nama, Integer umur){
        System.out.println("Hello " + nama);
        System.out.println("Umur saya "+umur+" tahun");
    }
    //return Method
    static int penjumlahan (int a, int b){
        return a+b;
    }
    //Constractor
    Playground(String nama){
        System.out.println("Hello "+nama);
    }
    public static void main(String[] args) {
//        greeting();
//        coba ("Zaim",10);
//        System.out.println(penjumlahan(4,5));
//        Playground play= new Playground();
//        play.Hello();
        Playground play = new Playground("Zaim");
        Playground play1= new Playground("Al Husna");

    }
}
