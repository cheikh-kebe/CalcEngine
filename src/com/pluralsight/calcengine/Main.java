package com.pluralsight.calcengine;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println("Average result = " + MathEquation.getAverageResult());

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9;
        double rightDouble = 4;

        equationOverload.execute(leftDouble, rightDouble);

        System.out.println("Overload result with doubles = " + equationOverload.getResult());

        int leftInt = 9;
        int rightInt = 4;
        /* Java converted double in integer but return as expected doubles*/
        equationOverload.execute(leftInt, rightInt);
        System.out.println("Overload result with integers = " + equationOverload.getResult());
    }

    private static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
    }


}



















