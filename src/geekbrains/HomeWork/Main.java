package geekbrains.HomeWork;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String [] wordArray = {"Anna", "Petr", "Dmitriy", "Maksim", "Petr", "Boris", "Anna", "Svetlana", "Dmitriy", "Petr", "Anna", "Vyacheslav", "Maksim", "Svetlana", "Yana", "Anna", "Boris", "Svetlana", "Dmitriy", "Anna"};
        HashMap <String, Integer> names = new HashMap<>();
        for (String word : wordArray){
            if (!names.containsKey(word)){
                names.put(word, 1);
            }
            else {
                names.put(word, names.get(word) + 1);
            }
        }
        System.out.println(names);
        System.out.println();

        Phonebook book = new Phonebook();
        book.add("Volkov",  89554553322L);
        book.add("Volkov", 89554553311L);
        book.add("Suvorov", 89554554522L);
        book.add("Ivanov", 89554554455L);
        book.add("Skryaga", 89554555566L);
        book.add("Medvedev", 89554556677L);
        book.add("Medvedev", 89554557788L);

        book.get("Volkov");
        System.out.println();
        book.get("Putin");


    }
}
