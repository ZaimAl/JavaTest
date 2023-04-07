package JavaTest;

import java.util.ArrayList;

public class listForArray {
    public static void main(String[] args) {

            ArrayList<ArrayList<String>> groceryList = new ArrayList();

            ArrayList<String> bakeryList = new ArrayList();
            bakeryList.add("bread");
            bakeryList.add("Donuts");
            bakeryList.add("Baguette");

            ArrayList<String> produceList = new ArrayList();
            produceList.add("Carrot");
            produceList.add("Tomato");
            produceList.add("Cucumber");

            ArrayList<String> drinksList = new ArrayList();
            drinksList.add("Milk");
            drinksList.add("coffee");

            groceryList.add(bakeryList);
            groceryList.add(produceList);
            groceryList.add(drinksList);

            System.out.println(groceryList);

        }
    }

