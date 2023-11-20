package CalculatorOOP;

import CalculatorOOP.cal.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.input();
        cal.process();
        cal.print();

    }
}