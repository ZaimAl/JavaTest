package Iteration;

public class forLoop {
    public static void main(String[] args) {
        //for
//        for (int i=0;i<7;i++){
//            if (i>1 && i<4) continue;;
//            System.out.println(i);
//            if (i==6)break;
//        }
        //for Array
        String[] arrayBuah = {"Mangga", "Apel", "Jeruk", "Pisang"};
        for (String buah:arrayBuah){
            System.out.println(buah);
        }
    }
}
