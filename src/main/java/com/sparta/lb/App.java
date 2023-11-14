package com.sparta.lb;

public class App
{
    public static void main( String[] args ) {
//        ATMMapImplementation myATM = new ATMMapImplementation();
//        myATM.withdrawMoney(157);
//        System.out.println(myATM.getQuantities().toString());
        testFunction(157);

    }
    public static int[] testFunction(int amount) {
        ATM myATM = new ATM();
        myATM.withdrawValue(amount);
        return myATM.getQuantities();
    }
}
