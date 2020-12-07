package se.lexicon.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class App {
    public static void main(String[] args) {

        //list();
        //set();
        map();
    }

    public static void list() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(200);

        System.out.println(numbers);

        numbers.add(100);

        numbers.set(0, 9000);

        System.out.println(numbers);

        numbers.remove(0);

        System.out.println(numbers);
    }


    public static void set() {

        HashSet<String> names = new HashSet<>();

        names.add("Ulf");
        names.add("Simon");
        names.add("Simon");

        System.out.println("names = " + names);

        System.out.println(names.contains("Eric"));


    }

    public static void map() {

        HashMap<String, Integer> accounts = new HashMap<>();

        //Adding
        accounts.put("Simon@lexicon.se", 100_000);

        //Updating
        accounts.put("Simon@lexicon.se", 1_000_000);

        accounts.get("Simon@lexicon.se");


        System.out.println(accounts.get("Simon@lexicon.se"));
        accounts.containsKey("Simon@lexicon.se");

        System.out.println("accounts = " + accounts);

    }
}
