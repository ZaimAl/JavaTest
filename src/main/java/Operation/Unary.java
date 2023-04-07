package Operation;

public class Unary {
    public static void main(String[] args) {
        Integer[] arrayBilangan = {4, 9, 12, 3, 6};
        System.out.println(--arrayBilangan[0]);
        System.out.println(arrayBilangan[1]++);
        System.out.println(arrayBilangan[1]);
        System.out.println(-arrayBilangan[2]);
        System.out.println(!true);
        System.out.println(!false);
    }
}
