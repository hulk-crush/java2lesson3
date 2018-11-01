package lesson3;

import java.util.ArrayList;
import java.util.HashMap;


    //2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
    public class PhoneBook {
        private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        public void add(String surname, String tel) {
            ArrayList<String> telList = phoneBook.get(surname);
            if (telList == null) telList = new ArrayList<>();
            telList.add(tel);
            phoneBook.put(surname, telList);
        }

        public ArrayList<String> get(String surname) {
            return phoneBook.get(surname);
        }

        public void info() {
            System.out.println(phoneBook);
        }

    }

