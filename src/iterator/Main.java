package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

// Тут имеется ввиду, что надо увеличить значения в самом массиве,
// обращаясь через итератор.
// TODO: внести соответствующие изменения в цикл
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(5);
        myList.add(2);
        myList.add(2);

        ListIterator<Integer> myIterator = myList.listIterator();

        while (myIterator.hasNext()) {
            Integer integer = myIterator.next() + 1;
            System.out.println(integer);
        }
    }


}
