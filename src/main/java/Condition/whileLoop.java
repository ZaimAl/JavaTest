package Condition;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        // while loop = executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";
        String option="";

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
//            while (option.isBlank()){
//                System.out.print("Are you sure using this name (Y/N): ");
//                option = scanner.nextLine();
//                while (option =="Y"){
//                    return;
//                }
//                while (option =="N"){
//                    System.out.print("Enter your name: ");
//                    name = scanner.nextLine();
//                }
//            }
        }
        System.out.println("Hello "+name);

    }

}
