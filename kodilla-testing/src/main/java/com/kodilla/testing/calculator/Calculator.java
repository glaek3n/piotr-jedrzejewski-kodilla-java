package com.kodilla.testing.calculator;

import java.util.*;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    };

    public int addAtoB() {
        return (a+b);

    }

    public int substractAfromB() {
        return (a-b);

    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator(20, 10);


            calculator.addAtoB();

            calculator.substractAfromB();

    }
}

