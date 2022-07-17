package Task5;

import java.util.ArrayList;
import java.util.List;


//Скажу честно сложно понял задачу с начало. По тыкав код, более или менее понял что нужно было сделать

public class MainRunTask2 {
    public static void main(String[] args) {
        // Рюкзак
        List<Item> items = new ArrayList<>();
        items.add(new Item("Книга",   1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Котелок", 1, 500));
        items.add(new Item("E-Boock",   3, 300));
        items.add(new Item("miniTV",   5, 10000));

        Backpack backpack = new Backpack(7);
        backpack.calcBestSet(items);

        for (Item item : backpack.getBestSet()) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println("Total best price is " + backpack.getBestPrice());
    }

}
