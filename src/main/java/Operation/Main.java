package Operation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukaan bilangan bulat pertama: ");
        int angka1 = keyboard.nextInt();
        System.out.print("Masukan bilangan bulat kedua: ");
        int angka2 = keyboard.nextInt();
        System.out.print("Kedua bilangan bernila sama: ");
        System.out.println(angka1==angka2);
        System.out.print("Bilangan pertama lebih besar dari bilangan kedua: ");
        System.out.println(angka1>angka2);
        System.out.print("Bilangan pertama lebih besar atau sama dari bilangan kedua: ");
        System.out.println(angka1>=angka2);
        System.out.print("Bilangan pertama lebih kecil dari bilangan kedua: ");
        System.out.println(angka1<angka2);
        System.out.print("Bilangan pertama lebih kecil atau sama dari bilangan kedua: ");
        System.out.println(angka1<=angka2);
        System.out.print("Bilangan pertama tidak sama dari bilangan kedua : ");
        System.out.println(angka1!=angka2);
    }
}
//5 == 8: salah
//        5 != 8: benar
//        5 > 8: salah
//        5 >= 8: salah
//        5 < 8: benar
//        5 <= 8: benar
//    Deklarasikan variabel integer a dengan nilai 10.
//        Gunakan operator penugasan += untuk menambahkan 5 ke a.
//        Gunakan operator penugasan -= untuk mengurangi 3 dari a.
//        Gunakan operator penugasan *= untuk mengalikan a dengan 2.
//        Gunakan operator penugasan /= untuk membagi a dengan 3.
//        Gunakan operator penugasan %= untuk mencari sisa dari a dibagi 2.
//        System.out.println(4==3);
//        System.out.println(4>3);
//        System.out.println(4>=3);
//        System.out.println(4<3);
//        System.out.println(4<=3);
//        System.out.println(4!=3);