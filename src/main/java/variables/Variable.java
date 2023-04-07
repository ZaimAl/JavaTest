package variables;

import java.util.Locale;

public class Variable {
    public static void main(String[] args) {
        Short angkaShort = 3278;
        int angkaINteger = 4444;
        long angaLong = 99_999_999;

        float angkaFloat = 32.1f;
        double angkaDuble = 72.7272727;

        boolean varBoolean = true;
        boolean varBooleanFalse = false;
        boolean pengecekanKondisi = 3>4;

        if (pengecekanKondisi){
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        char varChar = 'a';
        String varString = "Hello world";
        System.out.println(varString.toLowerCase(Locale.ROOT));
        System.out.println(varString.toUpperCase(Locale.ROOT));
        System.out.println(varString.concat(" !"));
        System.out.println(varString.length());

    }
}