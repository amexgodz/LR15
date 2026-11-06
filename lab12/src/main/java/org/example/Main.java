package org.example;

import java.util.*;

public class Main {
    public static  void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1: РАСТЕНИЯ");
        Map<String, Plant> map = new HashMap<>();

        Tree t1 = new Tree("дуб", 1, 15.0, 8.0);
        Tree t2 = new Tree("сосна", 2, 20.0, 4.0);
        Tree t3 = new Tree("береза", 3, 12.0, 5.0);

        Flower f1 = new Flower("роза", 4, 0.5, "красный");
        Flower f2 = new Flower("тюльпан", 5, 0.3, "желтый");
        Flower f3 = new Flower("ромашка", 6, 0.2, "белый");

        Shrub s1 = new Shrub("сирень", 7, 2.5, 12);
        Shrub s2 = new Shrub("малина", 8, 1.2, 8);

        map.put(t1.getName(), t1);
        map.put(t2.getName(), t2);
        map.put(t3.getName(), t3);

        map.put(f1.getName(), f1);
        map.put(f2.getName(), f2);
        map.put(f3.getName(), f3);

        map.put(s1.getName(), s1);
        map.put(s2.getName(), s2);

        for (Map.Entry<String, Plant> item : map.entrySet()) {
            System.out.println("ключ: " + item.getKey() + " | значение: " + item.getValue());
        }

        System.out.println();

        System.out.println("ЗАДАНИЕ 2: КАФЕ");
        List<Cafe> cafes = new ArrayList<>();

        List<Integer> rev1 = new ArrayList<>();
        rev1.add(5); rev1.add(5); rev1.add(4); rev1.add(4);
        cafes.add(new Cafe(1, "зерно", "независимости", 3, rev1));

        List<Integer> rev2 = new ArrayList<>();
        rev2.add(2); rev2.add(2); rev2.add(1); rev2.add(3);
        cafes.add(new Cafe(2, "утро", "немига", 2, rev2));

        List<Integer> rev3 = new ArrayList<>();
        rev3.add(4); rev3.add(5); rev3.add(5); rev3.add(4);
        cafes.add(new Cafe(3, "брест", "ленина", 4, rev3));

        List<Integer> rev4 = new ArrayList<>();
        rev4.add(3); rev4.add(4); rev4.add(3); rev4.add(3);
        cafes.add(new Cafe(4, "кофе саунд", "кульман", 3, rev4));

        List<Integer> rev5 = new ArrayList<>();
        rev5.add(1); rev5.add(2); rev5.add(2); rev5.add(1);
        cafes.add(new Cafe(5, "вкусняшка", "сурганова", 1, rev5));

        List<Integer> rev6 = new ArrayList<>();
        rev6.add(5); rev6.add(4); rev6.add(4); rev6.add(5);
        cafes.add(new Cafe(6, "тепло", "зыбицкая", 3, rev6));

        for (int i = cafes.size() - 1; i >= 0; i--) {
            if (cafes.get(i).getAverageReview() < 3.0) {
                cafes.remove(i);
            }
        }

        for (int i = 0; i < cafes.size(); i++) {
            Cafe c = cafes.get(i);
            if (c.getAverageReview() >= 4.0) {
                c.setRating(c.getRating() + 1);
            }
        }

        System.out.println();

        cafes.sort((c1, c2) -> {
            if (c2.getAverageReview() < c1.getAverageReview()) {
                return 1;
            } else if (c2.getAverageReview() > c1.getAverageReview()) {
                return -1;
            } else {
                return c2.getName().compareTo(c1.getName());
            }
        });
        System.out.println("список кафе после сортировки:");
        Iterator<Cafe> it = cafes.iterator();
        while (it.hasNext()) {
            Cafe c = it.next();
            System.out.println("id: " + c.getId() + ", имя: " + c.getName() + ", средний балл: " + c.getAverageReview());
        }

    }
}