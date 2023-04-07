package Condition;
public class Ifelseif {
    public static void main(String[] args) {
        int[] arrayNilai= {8, 10, 11, 12};
        String[] arrayPesan= {"Kamu telah lulus", "Kamu perlu perbaikan", "Kamu Tidak lulus"};
        String Hasil = (arrayNilai[1]>9) ? arrayPesan[0]:arrayPesan[2];
        System.out.println(Hasil);
//        if (arrayNilai[2]>=11){
//            System.out.println("Kamu telah lulus");
//        } else {
//            System.out.println("Kamu Tidak Lulus");
//        }
//        if (arrayNilai[2]>=11){
//            System.out.println("Kamu telah lulus");
//        } else if (arrayNilai[2]<10 && arrayNilai[2]>8) {
//            System.out.println("Kamu Perlu Perbaikan");
//        } else if (arrayNilai[2]>1 && arrayNilai[2]<8) {
//            System.out.println("kamu tidak lulus");
//        }

    }
}
