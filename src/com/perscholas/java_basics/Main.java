package com.perscholas.java_basics;

public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int isum = number1 + number2;
        int idivide = number2/number1;
        int x = 5;
        int y = 6;
        int q = y/x;
        double number3 = 30.5;
        double number4 = 40.5;
        double dbsum = number3 + number4;
        double idbsum = number1 + number3;
        double dbdivide = number4/number3;
        double qdouble = (double)y/x;
        final double INFLATION = .04;
        double constant = INFLATION * number4;
        double coffee = 4.95;
        double cappuccino = 6.95;
        double tea = 2.99;
        final double SALES_TAX = .08;
        double subtotal = coffee * 3 + cappuccino * 4 + tea * 2;
        double totalSale = SALES_TAX * subtotal + subtotal;
        int castedDbdivide = (int) dbdivide;
        String totalSale2 = String.format("%.2f", totalSale);

        System.out.println("The sum of question 1 is " + isum + ".");
        System.out.println("The sum of question 2 is " + dbsum + '.');
        System.out.println("The sum of question 3 is " + idbsum + ". The variable type must be in double!");
        System.out.println("The sum of question 4 is " + idivide + ". In order to add a decimal you need to change the variable type to double, if you add a decimal to a number in int it will fail and " +
                "either you change the numbers to double or remove the decimal.");
        System.out.println("The sum of question 5 is " + dbdivide);
        System.out.println("The sum of question 5 part 2 is " + castedDbdivide + ". It rounded it down to have no decimals.");
        System.out.println("The sum of question 6 is " + q + ". ");
        System.out.println("The sum of question 6 part 2 is " + qdouble + ". ");
        System.out.println("The sum of question 7 is " + constant + ". ");
        System.out.println("The sum of question 8 is " + totalSale2 + ". ");








    }
}
