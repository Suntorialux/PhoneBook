package Phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Андрей on 27.06.2015.
 */
public class Main {
    public static void main(String[] args){
        List<Phonebook> phonebooks= new ArrayList();
        phonebooks.add(new Phonebook(1,"Andrei","Egorov",3213));
        phonebooks.add(new Phonebook(2,"Andrei","Egorov",3213));
        phonebooks.add(new Phonebook(3,"Andrei","Egorov",3213));
        for(Phonebook s:phonebooks) {
            System.out.println(s);
        }
    }
}
