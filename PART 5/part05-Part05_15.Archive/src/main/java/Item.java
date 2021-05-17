/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Item {

    private String Identifier;
    private String name;

    public Item(String a, String b) {
        Identifier = a;
        name = b;
    }

    public String toString() {
        return  Identifier + ": " + name;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        Item item1 = (Item) compared;
        if ( this.Identifier.equals(item1.Identifier)) {
            return true;
        } else {
            return false;
        }

    }

}
