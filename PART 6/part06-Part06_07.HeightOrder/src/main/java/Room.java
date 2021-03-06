/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortest = persons.get(0);
        for (int i = 1; i < persons.size(); i++) {
            if (shortest.getHeight() > persons.get(i).getHeight()) {
                shortest = persons.get(i);
            }
        }
        return shortest;
    }

    public Person take(){
        Person p=shortest();
        persons.remove(p);
        return p;
    }
}
