/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Container {

    private int value;

    public Container() {
        value = 0;
    }

    public int contains() {
        return value;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (amount + value <= 100) {
                value += amount;
            }else{
                value=100;
            }
        }

    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount <= value) {
                value -= amount;
            } else {
                value = 0;
            }

        }
    }

    public String toString() {
        return value + "/100";
    }
}
