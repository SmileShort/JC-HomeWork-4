package geekbrains.HomeWork;

import java.util.*;

public class Phonebook  {

    HashMap<String, List<Long>> client;

    public Phonebook() {
        this.client = new HashMap<String, List<Long>>();
    }

    public void add(String surname, Long tel) {
        List<Long> number = new ArrayList<Long>();
        if (this.client.containsKey(surname)){
            number = this.client.get(surname);
            number.add(tel);
            this.client.put(surname, number);
        }
        else {
            number.add(tel);
            this.client.put(surname, number);
        }
    }

    public String get(String surname){
        String user = "Такого клиента нет ( " + surname + " )" ;
        if (this.client.containsKey(surname)) {
            user = "Телефон клиента по фамилии " + surname + " : " + this.client.get(surname).toString();
        }
        System.out.println(user);
        return user;
    }

}