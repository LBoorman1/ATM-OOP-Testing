package com.sparta.lb;

public class ATM
{
    private int[] values = {50,20,10,5,2,1};
    private int[] quantities = {12,20,50,100,250,500};

    public void withdrawValue(int amount) {
        int remaining = amount;
        while(remaining != 0) {
            for(int i = 0; i < values.length; i++) {
                if(remaining >= values[i]) {
                    remaining -= values[i];
                    quantities[i]--;
                    break;
                }
            }
        }
    }

    public int[] getValues() {
        return values;
    }

    public int[] getQuantities() {
        return quantities;
    }
}
