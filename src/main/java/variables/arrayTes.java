package variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayTes {
    public static void main(String[] args) {
        Integer[] arrayBilangan = {4, 9, 12, 3, 6};
        String[] arrayString = {"mawar", "Melati", "Tulip", "Kamboja"};
        //System.out.println(Arrays.toString(arrayString));
        //System.out.println(bilanganArray[2]);
        //System.out.println(arrayString[arrayString-2]);
        //System.out.println(arrayString.length);
//        for (Integer bil:arrayBilangan){
//            System.out.println(bil);
//        }
//        Arrays.sort(arrayBilangan);
//        System.out.println(Arrays.toString(arrayBilangan));

        List<Integer> listBilangan=new ArrayList<>();
        listBilangan.add (1);
        listBilangan.add (4);
        listBilangan.add (9);
//        System.out.println(listBilangan);
//        listBilangan.remove(1);
//        System.out.println(listBilangan);

        List<String> listString = new ArrayList<>();
        listString.add("Rubah");
        listString.add("Rusa");
        listString.forEach((list)->{
            System.out.println(list);
        });

        System.out.println(listBilangan.contains(2));

    }}
