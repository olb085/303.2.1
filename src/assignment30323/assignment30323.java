package assignment30323;

public class assignment30323 {
    public static void main(String[] args) {
        //question 1
        int x = 2;
        int a1 = 9;
        int b1 = 17;
        int c1 = 88;
        //question 2
        int x2 = 150;
        int a2 = 225;
        int b2 = 1555;
        int c2 = 32456;
        //question 3
        int x3, y3, z3;
        x3 = 7;
        y3 = 17;
        //Bitwise AND will be 1
        z3 = x3 & y3;
        //question 5
        int number = 4;
        //question 6 below
        int number2 = 10;
        //question 7 below
        int x7, y7, z7,k7;
        x7 = 5;
        y7 = 8;
        z7 = ++x7 + y7;
        k7 = x7++ + y7;

        //question 1
        System.out.println("Original x (decimal): " + x + ", binary: " + Integer.toBinaryString(x));
        System.out.println("Original a1 (decimal): " + a1 + ", binary: " + Integer.toBinaryString(a1));
        System.out.println("Original b1 (decimal): " + b1 + ", binary: " + Integer.toBinaryString(b1));
        System.out.println("Original c1 (decimal): " + c1 + ", binary: " + Integer.toBinaryString(c1));
        //question 2
        System.out.println("Original x2 (decimal): " + x2 + ", binary: " + Integer.toBinaryString(x2));
        System.out.println("Original a2 (decimal): " + a2 + ", binary: " + Integer.toBinaryString(a2));
        System.out.println("Original b2 (decimal): " + b2 + ", binary: " + Integer.toBinaryString(b2));
        System.out.println("Original c2 (decimal): " + c2 + ", binary: " + Integer.toBinaryString(c2));
        // question three is below
        System.out.println("Result of x & y: " + z3);
        // question 4 has no numbers so below is question 5
        System.out.println("before increment: " + number);
        // question 6 below
        System.out.println("before first increment:" + number2);
        //question 7 with ++x below
        System.out.println("++x sum is:" + z7);
        System.out.println("x++ sum is:" + k7);


        // Prediction left operator (question 2) - Decimal value: 4, 18, 34, 176, Binary value: 100, 10010, 100010, 10110000
        // Prediction right operator (question 2) - Decimal Value: 36, 56, 388, 8114 Binary Value: 100101, 111000, 110000100, 1111110110010

        //question 1
        x = x << 1;
        a1 = a1 << 1;
        b1 = b1 << 1;
        c1 = c1 << 1;
        //question 2
        x2 = x2 >> 2;
        a2 = a2 >> 2;
        b2 = b2 >> 2;
        c2 = c2 >> 2;
        //postfix increment operator
        number++;
        //question 6
        number2++;


        //question 1
        System.out.println("Shifted x (decimal): " + x + ", binary: " + Integer.toBinaryString(x));
        System.out.println("Shifted a1 (decimal): " + a1 + ", binary: " + Integer.toBinaryString(a1));
        System.out.println("Shifted b1 (decimal): " + b1 + ", binary: " + Integer.toBinaryString(b1));
        System.out.println("Shifted c1 (decimal): " + c1 + ", binary: " + Integer.toBinaryString(c1));
        //question 2
        System.out.println("Shifted x2 (decimal): " + x2 + ", binary: " + Integer.toBinaryString(x2));
        System.out.println("Shifted a2 (decimal): " + a2 + ", binary: " + Integer.toBinaryString(a2));
        System.out.println("Shifted b2 (decimal): " + b2 + ", binary: " + Integer.toBinaryString(b2));
        System.out.println("Shifted c2 (decimal): " + c2 + ", binary: " + Integer.toBinaryString(c2));
        //question 5 is below
        System.out.println("After increment: " + number);
        //question 6 first increment
        System.out.println("after first increment: " + number2);
        //question 6 second increment
        number2 += 1;
        //question 6 after second increment
        System.out.println("after second increment: " + number2);
        //question 6 third increment
        number2 = number2 + 1;
        //question 6 after third increment
        System.out.println("after third increment: " + number2);
    }
}
