package codingnomads.examples.operators;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Operators {

    public static void main(String[] args) {

//        // ARITHMETIC OPERATORS
//        // + - * / %
//        int a = 10;
//        int b = 20;
//        int c = a + b;
//        int d = b - a;
//        int e = a * b;
//        int f = b / a;
//        // modulus returns the remainder - or the value that cannot divide
//        // equally into the numerator 14 / 3 = 4 r2
//        int mod = b % a;
//
//        int z = 14;
//        int y = 3;
//        int x = z % y;
//
//        System.out.println(x);
//
//        // RELATIONAL OPERATORS
//        double val1 = 123.45;
//        double val2 = 345.67;
//
//        if(val1 < val2){
//            System.out.println("val1 is less than val2");
//        }
//        if (val1 <= val2){
//            System.out.println("val1 is less than or equal to val2");
//        }
//        if (val1 > val2){
//            System.out.println("val1 is greater than or equal to val2");
//        }
//        if (val1 >= val2){
//            System.out.println("val1 is greater than or equal to val2");
//        }
//        if (val1 == val2){
//            System.out.println("val1 is equal to val2");
//        }
//        if (val1 != val2){
//            System.out.println("val1 is not equal to val2");
//        }

        // LOGICAL OPERATORS
        boolean b1 = false;
        boolean b2 = false;

        // AND
        if (b1 & b2){
            System.out.println("1 - both b1 & b2 are true");
        }
        // SHORT-CIRCUIT AND
        if (b1 && b2){
            System.out.println("2 - both b1 & b2 are true - SHORT-CIRCUIT AND");
        }
        // OR
        if (b1 | b2){
            System.out.println("3 - either b1 or b2 is true - both could be true");
        }
        // SHORT-CIRCUIT OR
        if (b1 || b2){
            System.out.println("4 - either b1 or b2 is true - SHORT-CIRCUIT OR ");
        }
        // EXCLUSIVE OR - XOR - one can be true - but not both
        if (b1 ^ b2){
            System.out.println("5 - either b1 or b2 is true - only one can be true");
        }
        if (!b2){
            System.out.println("6 - !b2 is true");
        }


    }

}
