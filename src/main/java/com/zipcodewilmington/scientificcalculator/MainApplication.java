package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static java.lang.Integer.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Shapes shapes = new Shapes();
        Features f = new Features();
        SciFeatures sf = new SciFeatures();
        sf.displayMode = "decimal";
        sf.unitsMode = "Degrees";

        Console.println("Designed by Chris, Maurice, and Ujjwal.");
        Console.println("Welcome to the surprisely working calculator!");

        String s = Console.getStringInput("Please enter your name?");
        boolean eternal = true;
        while (eternal) {
            int display = 0;
            int r = 1;
            do {
                try {
                    Double calcDouble = Console.getDoubleInput("Press 1 for base calculator, 2 for scientific calculator, or 3 for shapes!");

                    if (calcDouble == 1) {
                        Console.println("Current number is: " + display);

                        //Double i = Console.getDoubleInput("Please enter another number if you want:");

                        boolean check = true;
                        while (check) {
                            do {
                                try {
                                    r = 1;
                                    Double i = Console.getDoubleInput("Please enter another number if you want:");
                                    String op = Console.getOperationInput("Enter an operation : +, - , *, /, ^2, ^y, inverse, sqrt, invert, c, end : ");
                                    if (op.equals("+")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        Console.println("New Value is: " + f.add(i, i1));
                                        i = f.add(i, i1);
                                    } else if (op.equals("-")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        Console.println("New Value is: " + f.subtract(i, i1));
                                    } else if (op.equals("*")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        Console.println("New Value is: " + f.multiply(i, i1));
                                    } else if (op.equals("/")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        if (i1 == 0) {
                                            Console.println("Err");
                                        } else {
                                            Console.println("New Value is: " + f.divide(i, i1));
                                        }
                                    } else if (op.equals("^y")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        Console.println("New Value is: " + f.exponent(i, i1));

                                    } else if (op.equals("^2")) {
                                        Console.println("New Value is: " + f.square(i));
                                    } else if (op.equals("sqrt")) {
                                        if (i < 0) {
                                            Console.println("Err");
                                        } else {
                                            Console.println("New Value is: " + f.root(i));
                                        }
                                    } else if (op.equals("inverse")) {
                                        if (i == 0) {
                                            Console.println("Err");
                                        } else {
                                            Console.println("New Value is: " + f.inverse(i));
                                        }
                                    } else if (op.equals("invert")) {
                                        Console.println("New Value is: " + f.invert(i));
                                    } else if (op.equals("c")) {
                                        Console.println("New Value is: " + f.clear());
                                        i = 0.0;
                                    } else if (op.equals("end")) {
                                        check = false;
                                        r++;
                                    } else {
                                        Console.println("Err");
                                    }

                                } catch (Exception e) {

                                }
                            } while (r == 1);
                        }
                    } else if (calcDouble == 2) {
                        Console.println("The current modes are decimal and Degrees.");
                        Console.println("Current number is: " + display);

                        //Double i = Console.getDoubleInput("Please enter another number if you want:");

                        boolean check = true;
                        while (check) {
                            do {
                                try {
                                    r = 1;
                                    Double i = Console.getDoubleInput("Please enter another number if you want.");
                                    String op = Console.getOperationInput("Enter an operation : +, - , *, /, ^2, ^y, inverse, sqrt, invert, display(), display, M+, MC, MRC, Sine, Cosine,\n" +
                                            " Tangent, invSine, invCosine, invTangent, units(), units, log, 10^x, Ln, e^x, !, c, end(to exit) : ");
                                    if (op.equals("+")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + f.add(i, i1));
                                            i = f.add(i, i1);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(f.add(i,i1));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(f.add(i,i1));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(f.add(i,i1));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else if (op.equals("-")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + f.subtract(i, i1));
                                            i = f.subtract(i, i1);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(f.subtract(i,i1));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(f.subtract(i,i1));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(f.subtract(i,i1));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else if (op.equals("*")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + f.multiply(i, i1));
                                            i = f.multiply(i, i1);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(f.multiply(i,i1));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(f.multiply(i,i1));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(f.multiply(i,i1));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else if (op.equals("/")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        if (i1 == 0) {
                                            Console.println("Err");
                                        } else {
                                            if (sf.displayMode.equalsIgnoreCase("decimal")){
                                                Console.println("New Value is: " + f.divide(i, i1));
                                                i = f.divide(i,i1);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("binary")){
                                                int j = (int) Math.round(f.divide(i,i1));
                                                String str = toBinaryString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                                int j = (int) Math.round(f.divide(i,i1));
                                                String str = toHexString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("octal")){
                                                int j = (int) Math.round(f.divide(i,i1));
                                                String str = toOctalString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                        }
                                    } else if (op.equals("^y")) {
                                        Double i1 = Console.getDoubleInput("Please enter next number:");
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + f.exponent(i, i1));
                                            i = f.exponent(i,i1);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(f.exponent(i,i1));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(f.exponent(i,i1));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(f.exponent(i,i1));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else if (op.equals("^2")) {
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + f.square(i));
                                            i = f.square(i);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(f.square(i));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(f.square(i));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(f.square(i));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else if (op.equals("sqrt")) {
                                        if (i < 0) {
                                            Console.println("Err");
                                        } else {
                                            if (sf.displayMode.equalsIgnoreCase("decimal")){
                                                Console.println("New Value is: " + f.root(i));
                                                i = f.root(i);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("binary")){
                                                int j = (int) Math.round(f.root(i));
                                                String str = toBinaryString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                                int j = (int) Math.round(f.root(i));
                                                String str = toHexString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("octal")){
                                                int j = (int) Math.round(f.root(i));
                                                String str = toOctalString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                        }
                                    } else if (op.equals("inverse")) {
                                        if (i == 0) {
                                            Console.println("Err");
                                        } else {
                                            if (sf.displayMode.equalsIgnoreCase("decimal")){
                                                Console.println("New Value is: " + f.inverse(i));
                                                i = f.inverse(i);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("binary")){
                                                int j = (int) Math.round(f.inverse(i));
                                                String str = toBinaryString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                                int j = (int) Math.round(f.inverse(i));
                                                String str = toHexString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("octal")){
                                                int j = (int) Math.round(f.inverse(i));
                                                String str = toOctalString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                        }
                                    } else if (op.equals("invert")) {
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + f.invert(i));
                                            i = f.invert(i);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(f.invert(i));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(f.invert(i));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(f.invert(i));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else if (op.equals("c")) {
                                        Console.println("New Value is: " + f.clear());
                                        i = 0.0;
                                    } else if (op.equals("end")) {
                                        check = false;
                                        r++;
                                    } else if (op.equals("display()")) {
                                        int t = 1;
                                        do {
                                            try {
                                                String imp = Console.getOperationInput("Type binary, octal, decimal, hexadecimal");
                                                if (imp.equalsIgnoreCase("binary")) {
                                                    Console.println("The display is now binary.");
                                                    sf.switchDisplayMode("binary");
                                                } else if (imp.equalsIgnoreCase("octal")) {
                                                    Console.println("The display is now octal.");
                                                    sf.switchDisplayMode("octal");
                                                } else if (imp.equalsIgnoreCase("decimal")) {
                                                    Console.println("The display is now decimal.");
                                                    sf.switchDisplayMode("decimal");
                                                } else if (imp.equalsIgnoreCase("hexadecimal")) {
                                                    Console.println("The display is now hexadecimal.");
                                                    sf.switchDisplayMode("hexadecimal");
                                                } else {
                                                    Console.println("Invalid entry.  \nWhy are you the way that you are?\nDo it right next time >:(");
                                                }
                                                t++;
                                            } catch (Exception e) {
                                                Console.println("Why are you the way that you are?");
                                            }
                                        } while (t == 1);
                                    } else if (op.equals("display")) {
                                        if (sf.displayMode.equalsIgnoreCase("binary")){
                                            Console.println("The display is now octal.");
                                            sf.switchDisplayMode();
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            Console.println("The display is now decimal.");
                                            sf.switchDisplayMode();
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("The display is now hexadecimal.");
                                            sf.switchDisplayMode();
                                        }
                                        else {
                                            Console.println("The display is now binary.");
                                            sf.switchDisplayMode();
                                        }
                                    } else if (op.equals("M+")) {
                                        sf.storeMemory(i);
                                    } else if (op.equals("MC")) {
                                        sf.clearMemory();
                                    } else if (op.equals("MRC")) {
                                        Console.println("" + sf.memoryRecall());
                                        i = sf.memoryRecall();
                                    } else if (op.equals("Sine")) {
                                        if (sf.unitsMode == "Degrees") {
                                            Console.println("New Value is: " + sf.sine(i));
                                            i = sf.sine(i);
                                        } else {
                                            Console.println("New Value is: " + sf.sine(Math.toRadians(i)));
                                            i = sf.sine(Math.toRadians(i));
                                        }
                                    } else if (op.equals("Cosine")) {
                                        if (sf.unitsMode == "Degrees") {
                                            Console.println("New Value is: " + sf.cosine(i));
                                            i = sf.cosine(i);
                                        } else {
                                            Console.println("New Value is: " + sf.cosine(Math.toRadians(i)));
                                            i = sf.cosine(Math.toRadians(i));
                                        }
                                    } else if (op.equals("Tangent")) {
                                        if (sf.unitsMode == "Degrees") {
                                            Console.println("New Value is: " + sf.tangent(i));
                                            i = sf.tangent(i);
                                        } else {
                                            Console.println("New Value is: " + sf.tangent(Math.toRadians(i)));
                                            i = sf.tangent(Math.toRadians(i));
                                        }
                                    } else if (op.equals("invSine")) {
                                        if (i < -1 || i > 1) {
                                            Console.println("Err");
                                        } else {
                                            if (sf.unitsMode == "Degrees") {
                                                Console.println("New Value is: " + sf.sineInverse(i));
                                                i = sf.sineInverse(i);
                                            } else {
                                                Console.println("New Value is: " + sf.sineInverse(Math.toRadians(i)));
                                                i = sf.sineInverse(Math.toRadians(i));
                                            }
                                        }
                                    } else if (op.equals("invCosine")) {
                                        if (i < -1 || i > 1) {
                                            Console.println("Err");
                                        } else {
                                            if (sf.unitsMode == "Degrees") {
                                                Console.println("New Value is: " + sf.cosineInverse(i));
                                                i = sf.cosineInverse(i);
                                            } else {
                                                Console.println("New Value is: " + sf.cosineInverse(Math.toRadians(i)));
                                                i = sf.cosineInverse(Math.toRadians(i));
                                            }

                                        }
                                    } else if (op.equals("invTangent")) {
                                        if (sf.unitsMode == "Degrees") {
                                            Console.println("New Value is: " + sf.tangentInverse(i));
                                            i = sf.tangentInverse(i);
                                        } else {
                                            Console.println("New Value is: " + sf.tangentInverse(Math.toRadians(i)));
                                            i = sf.tangentInverse(Math.toRadians(i));
                                        }
                                    } else if (op.equals("units()")){
                                        int p = 1;
                                        do {
                                            try {
                                                String useful = Console.getOperationInput("Enter degrees or radians");
                                                if (useful.equalsIgnoreCase("degrees")){
                                                    Console.println("The mode is now Radians.");
                                                    sf.switchUnitsMode("Degrees");
                                                }
                                                else if (useful.equalsIgnoreCase("radians")) {
                                                    Console.println("The mode is now Degrees.");
                                                    sf.switchUnitsMode("Radians");
                                                }
                                                p++;
                                            } catch (Exception e){
                                                Console.println("Err");
                                            }
                                        } while (p == 1);
                                    } else if (op.equals("units")){
                                        if (sf.unitsMode.equalsIgnoreCase("Degrees")){
                                            Console.println("The mode is now Radians.");
                                            sf.switchUnitsMode();;
                                        }
                                        else {
                                            Console.println("The mode is now Degrees.");
                                            sf.switchUnitsMode();
                                        }
                                    }
                                    else if (op.equals("log")) {
                                        if (i <= 0) {
                                            Console.println("Err");
                                        } else {
                                            if (sf.displayMode.equalsIgnoreCase("decimal")){
                                                Console.println("New Value is: " + sf.logarithm(i));
                                                i = sf.logarithm(i);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("binary")){
                                                int j = (int) Math.round(sf.logarithm(i));
                                                String str = toBinaryString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                                int j = (int) Math.round(sf.logarithm(i));
                                                String str = toHexString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("octal")){
                                                int j = (int) Math.round(sf.logarithm(i));
                                                String str = toOctalString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                        }
                                    } else if (op.equals("10^x")) {
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + sf.inverseLog(i));
                                            i = sf.inverseLog(i);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(sf.inverseLog(i));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(sf.inverseLog(i));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(sf.inverseLog(i));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else if (op.equals("Ln")) {
                                        if (i <= 0) {
                                            Console.println("Err");
                                        } else {
                                            if (sf.displayMode.equalsIgnoreCase("decimal")){
                                                Console.println("New Value is: " + sf.naturalLog(i));
                                                i = sf.naturalLog(i);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("binary")){
                                                int j = (int) Math.round(sf.naturalLog(i));
                                                String str = toBinaryString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                                int j = (int) Math.round(sf.naturalLog(i));
                                                String str = toHexString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                            else if (sf.displayMode.equalsIgnoreCase("octal")){
                                                int j = (int) Math.round(sf.naturalLog(i));
                                                String str = toOctalString(j);
                                                Console.println("New Value is: " + str);
                                            }
                                        }
                                    } else if (op.equals("e^x")) {
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + sf.inverseNaturalLog(i));
                                            i = sf.inverseNaturalLog(i);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(sf.inverseNaturalLog(i));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(sf.inverseNaturalLog(i));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(sf.inverseNaturalLog(i));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else if (op.equals("!")) {
                                        int factor = Math.toIntExact(Math.round(i));
                                        if (sf.displayMode.equalsIgnoreCase("decimal")){
                                            Console.println("New Value is: " + sf.factorial(factor));
                                            i = (double) sf.factorial(factor);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("binary")){
                                            int j = (int) Math.round(sf.factorial(factor));
                                            String str = toBinaryString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("hexadecimal")){
                                            int j = (int) Math.round(sf.factorial(factor));
                                            String str = toHexString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                        else if (sf.displayMode.equalsIgnoreCase("octal")){
                                            int j = (int) Math.round(sf.factorial(factor));
                                            String str = toOctalString(j);
                                            Console.println("New Value is: " + str);
                                        }
                                    } else {
                                        Console.println("Err");
                                    }

                                } catch (Exception e) {

                                }
                            } while (r == 1);
                        }
                    } else if (calcDouble == 3) {
                        boolean check = true;
                        while (check) {
                            do {
                                try {
                                    r = 1;
                                    String op = Console.getOperationInput("Enter a shape you wish to work with: quad, circle, triangle or end(to exit)");
                                    if (op.equalsIgnoreCase("quad")) {
                                        String info = Console.getOperationInput("Press r to return or continue to quadrilateral area with any key.");
                                        if (info.equalsIgnoreCase("r")) {
                                        } else {
                                            double w = Console.getDoubleInput("Enter the width");
                                            double l = Console.getDoubleInput("Enter the length");
                                            if (w < 0 || l < 0) {
                                                Console.println("Err");
                                            } else {
                                                Console.println("The area of your quadrilateral is: " + shapes.quadArea(w, l));
                                            }
                                        }
                                    } else if (op.equalsIgnoreCase("triangle")) {
                                        String info1 = Console.getOperationInput("Press r to return or continue to triangle area with any key.");
                                        if (info1.equalsIgnoreCase("r")) {
                                        } else {
                                            double w = Console.getDoubleInput("Enter the width");
                                            double h = Console.getDoubleInput("Enter the height");
                                            if (w < 0 || h < 0) {
                                                Console.println("Err");
                                            } else {
                                                Console.println("The area of your triangle is: " + shapes.triangleArea(w, h));
                                            }
                                        }
                                    } else if (op.equalsIgnoreCase("circle")) {
                                        String info2 = Console.getOperationInput(("Press r to return or continue to circle area with any key."));
                                        if (info2.equalsIgnoreCase("r")) {
                                        } else {
                                            double radius = Console.getDoubleInput("Enter the radius");
                                            if (radius < 0) {
                                                Console.println("Err");
                                            } else {
                                                Console.println("The area of your circle is " + shapes.circleArea(radius));
                                            }
                                        }
                                    } else if (op.equalsIgnoreCase("end")) {
                                        check = false;
                                        r++;
                                    } else { }

                                } catch (Exception e) {
                                    Console.println("Err");
                                }
                            } while (r == 1);
                        }
                    }
                } catch (Exception e) {
                    Console.println("Err");
                }
            } while (r == 1);
        }
    }
}
