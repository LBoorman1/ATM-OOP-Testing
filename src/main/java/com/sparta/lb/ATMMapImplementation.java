package com.sparta.lb;

import java.util.Comparator;
import java.util.TreeMap;

public class ATMMapImplementation
{
    //Tried with HashMap but order of keys was wrong so changed to TreeMap and used Comparator to reverse keys to
    //descending order
    private TreeMap<Integer, Integer> valueQuantity = new TreeMap<Integer, Integer>(Comparator.reverseOrder()) {{
        put(50, 12);
        put(20, 20);
        put(10, 50);
        put(5, 100);
        put(2, 250);
        put(1, 500);
    }};

    public void withdrawMoney(int amount) {
        int remaining = amount;
        while(remaining != 0) {
            for (Integer value: valueQuantity.keySet()) {
                Integer quantity = valueQuantity.get(value);

                if(remaining >= value) {
                    remaining = remaining - value;
                    quantity--;
                    valueQuantity.put(value, quantity);
                    break;
                }
            }
        }
    }

    public TreeMap<Integer, Integer> getQuantities() {
        return valueQuantity;
    }
}
