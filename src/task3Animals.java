import java.util.ArrayList;

/* В данном случае ты скопировала и вставила кусок кода из задания 2.
 * Попробуй внести изменения в этом задании (и, возможно, в задании 2),
 * которые позволят импортировать класс Zoo (чтобы убрать необходимость
 * в копировании уже написанного кода).
 */
// TODO: внести соответствующие изменения

public class task3Animals {

    public static void main(String[] args) {

        ArrayList<String> zoo = new ArrayList<>();

        zoo.add(0, "Lion");
        zoo.add(1, "Ostrich");
        zoo.add(2, "Rabbit");
        zoo.add(3, "Tiger");
        zoo.add(4, "Gorilla");
        zoo.add(5, "Zebra");
        zoo.add(6, "Elephant");
        zoo.add(7, "Lama");

        for (String z:
                zoo) {
            System.out.println(z);
        }

        System.out.println("______________________________");

        zoo.remove(7);
        zoo.remove(4);
        zoo.remove(2);

        for (String z:
                zoo) {
            System.out.println(z);
        }

        System.out.println("The size of the list is " + zoo.size());


    }
}
