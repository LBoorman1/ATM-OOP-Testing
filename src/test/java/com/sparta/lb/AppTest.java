package com.sparta.lb;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest
{
    @Test
    @DisplayName("Testing withdrawing the amount 157")
    public void testingWithdrawingAmount157() {
        int[] expected = {9,20,50,99,249,500};
        Assertions.assertArrayEquals(expected, App.testFunction(157));
    }

    @Test
    @DisplayName("Testing withdrawing the amount 100")
    public void testingWithdrawingAmount100() {
        int[] expected = {10,20,50,100,250,500};
        Assertions.assertArrayEquals(expected, App.testFunction(100));
    }
}
