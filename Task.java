package lesson3;
import java.util.HashMap;
public class Task {

    //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать сколько раз встречается каждое слово.

    public static void main(String[] args) {
        String[] words = {
                "one",
                "two",
                "three",
                "four",
                "five",
                "one",
                "hello",
                "meow",
                "one",
                "six",
                "seven",
                "meow",
                "one",
                "ten",
                "hello",
                "java",
                "meow",
                "one"};
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word: words) {
            Integer res = hm.get(word);
            hm.put(word, res == null ? 1 : res + 1);
        }
        System.out.println(hm);

        //2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.

        //Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля
        // (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
        // Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Pitt", "+67856574760");
        phoneBook.add("Jolie", "+787547690054");
        phoneBook.add("Depp", "+3445667789673");
        phoneBook.add("DiCaprio", "+2875629735409");

        phoneBook.info();

        System.out.println("Depp have a number: " + phoneBook.get("Depp"));
    }

}

