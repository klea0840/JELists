package task2Animals;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<String> zoo = new ArrayList<>();

        // Если добавляем в конец списка, можно обойтись без индекса
        zoo.add("Lion");
        zoo.add(1, "Ostrich");
        zoo.add(2, "Rabbit");
        zoo.add("Tiger");
        zoo.add(4, "Gorilla");
        zoo.add("Zebra");
        zoo.add(6, "Elephant");
        zoo.add(7, "Lama");

        for (String z:
             zoo) {
            System.out.println(z);
        }

    }

}
