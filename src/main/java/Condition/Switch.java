package Condition;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int Angka;
        String Hari;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Masukan angka 1-7");
        Angka = keyboard.nextInt();
        switch (Angka){
            case 1:
                Hari = "Senin";
                break;
            case 2:
                Hari = "Selasa";
                break;
            case 3:
                Hari = "Rabu";
                break;
            case 4:
                Hari = "Kamis";
                break;
            case 5:
                Hari = "Jumat";
                break;
            case 6:
                Hari = "Sabtu";
                break;
            case 7:
                Hari = "Minggu";
                break;
            default:
                Hari = "Mohon Masukan Angka 1-7";
        }
        System.out.println(Hari);
    }
}
