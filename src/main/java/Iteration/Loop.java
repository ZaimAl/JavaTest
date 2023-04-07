package  Iteration;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // While
        int  nilai=0;
//        while (nilai<9){
//            nilai++;
//            if (nilai >= 2 && nilai<= 4) continue;
//            System.out.println(nilai);
//            if (nilai ==8) break;
//        }
        // do while
//        do {
//            System.out.println("cuy");
//            nilai++;
//        }while (nilai<0);
        //Implemantatin autmation
        boolean display = true;
        while (display && nilai<3){
            System.out.println("Cuy");
            nilai++;
        }
    }

    public static class Test14 {
        public static void main(String[] args) {
            int Angka;
            Scanner keyboard= new Scanner(System.in);
            System.out.println("Masukan angka:");
            Angka = keyboard.nextInt();
            if (Angka == 1 || Angka == 3 || Angka == 5|| Angka==7|| Angka==9){
                System.out.println("Ganjil");
            } else if (Angka == 2 || Angka == 4 || Angka == 6|| Angka==8 || Angka==10) {
                System.out.println("Genap");
            } else if (Angka <1 || Angka>10) {
                System.out.println("Angka diluar jangkauan");
            }
        }
    }
}
